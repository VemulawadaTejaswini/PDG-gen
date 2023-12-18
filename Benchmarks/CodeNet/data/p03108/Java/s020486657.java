import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int m = fs.nextInt();
		int[][] bridgeArr = new int[m][2];
		
		for(int i = 0; i < m; i++) {
			bridgeArr[i][0] = fs.nextInt();
			bridgeArr[i][1] = fs.nextInt();
		}
		
//		long combIsland = 0; 
		
		HashMap<Integer, HashSet<Integer>> islandBelongMap = new HashMap<>();
		long[] diffArr = new long[m];
		
		for(int i = m - 1; i >= 0; i--) {
			int[] bridge = bridgeArr[i];
			if(!islandBelongMap.containsKey(bridge[0]) && !islandBelongMap.containsKey(bridge[1])) {
				HashSet<Integer> newSet = new HashSet<>();
				newSet.add(bridge[0]);
				newSet.add(bridge[1]);
				islandBelongMap.put(bridge[0], newSet);
				islandBelongMap.put(bridge[1], newSet);
//				combIsland += 2;
				diffArr[i] += 1;
			}
			if(!islandBelongMap.containsKey(bridge[0]) && islandBelongMap.containsKey(bridge[1])) {
				HashSet<Integer> existSet = islandBelongMap.get(bridge[1]);
				existSet.add(bridge[0]);
				islandBelongMap.put(bridge[0], existSet);
//				combIsland += existSet.size()-1;
				diffArr[i] = existSet.size()-1;
			}
			if(islandBelongMap.containsKey(bridge[0]) && !islandBelongMap.containsKey(bridge[1])) {
				HashSet<Integer> existSet = islandBelongMap.get(bridge[0]);
				existSet.add(bridge[1]);
				islandBelongMap.put(bridge[1], existSet);
//				combIsland += existSet.size()-1;
				diffArr[i] = existSet.size()-1;
			}
			if(islandBelongMap.containsKey(bridge[0]) && islandBelongMap.containsKey(bridge[1])) {
				
				HashSet<Integer> existSet0 = islandBelongMap.get(bridge[0]);
				HashSet<Integer> existSet1 = islandBelongMap.get(bridge[1]);
				
				if(existSet0 == existSet1) {
					continue;
				}
				

				long beforeComb = comb(existSet0.size()) + comb(existSet1.size());
				
				if(existSet0.size() < existSet1.size()) {
					HashSet<Integer> tempSet = existSet0;
					existSet0 = existSet1;
					existSet1 = tempSet;
				}
				
				existSet0.addAll(existSet1);
				
				for(Integer intVal : existSet1) {
					islandBelongMap.put(intVal, existSet0);
				}
				
				
				long afterComb = comb(existSet0.size());
				
				diffArr[i] = afterComb - beforeComb;
			}
		}
		long cumulative = 0;
		for(int i = 0; i < m; i++) {
			cumulative += diffArr[i];
			System.out.println(cumulative);
		}
	}
	
	long comb(int n) {
		return ((long)n * (long) (n-1)) / 2;
	}

	

	public class FastScanner {

		BufferedReader reader;
		private StringTokenizer st;

		public FastScanner() {
			st = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			if (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(reader.readLine());
			}
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
			return readLine;
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArr(int n) throws NumberFormatException, IOException {
			int[] retArr = new int[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}

		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}

		public void close() throws IOException {
			reader.close();
		}
	}


}
