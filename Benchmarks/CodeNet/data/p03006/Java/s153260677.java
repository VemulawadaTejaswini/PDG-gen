import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		
		ArrayList<Point> pointArr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int x = fs.nextInt();
			int y = fs.nextInt();
			
			pointArr.add(new Point(i, x ,y));
		}
		
		HashMap<Integer, HashMap<Integer, Integer>> distanceMap  = new HashMap<>();
		
		for(int i = 0; i < n ; i++) {
			for(int j = i+1; j < n; j++) {
				Point startPoint = pointArr.get(i);
				Point endPoint = pointArr.get(j);
				
				if(startPoint.x > endPoint.x) {
					Point swap = startPoint;
					startPoint = endPoint;
					endPoint = swap;
				}
				
				int xDistance = endPoint.x - startPoint.x;
				int yDistance = endPoint.y - startPoint.y;
				
				HashMap<Integer,Integer> yDistanceMap;
				
				if(distanceMap.containsKey(xDistance)) {
					yDistanceMap = distanceMap.get(xDistance);
				}else {
					yDistanceMap = new HashMap<>();
				}
				
				if(yDistanceMap.containsKey(yDistance)) {
					int time = yDistanceMap.get(yDistance);
					yDistanceMap.put(yDistance, time+1);
				}else {
					yDistanceMap.put(yDistance, 1);
				}
				
				distanceMap.put(xDistance, yDistanceMap);
			}
		}
		
		int maxPair = 0;
		
		for(Integer xkey : distanceMap.keySet()) {
			
			HashMap<Integer, Integer> yDistanceMap = distanceMap.get(xkey);
			
			for(Integer yKey : yDistanceMap.keySet()) {
				if(yKey == 0 && xkey == 0) {
					continue;
				}
				
				maxPair = Math.max(maxPair, yDistanceMap.get(yKey));
			}
		}
		
		System.out.println(n-maxPair);
		
	}
	
	class Pair {
		
		int startId;;
		int endId;
		
		Pair(int startId, int endId){
			this.startId = startId;
			this.endId = endId;
		}
	}
	
	class Point {
		int id;
		int x;
		int y;
		
		Point(int id, int x, int y){
			this.id = id;
			this.x = x;
			this.y = y;
		}
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
