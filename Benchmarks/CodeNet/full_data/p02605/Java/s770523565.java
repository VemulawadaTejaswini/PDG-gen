import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	static final int INF = 50000000;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		ArrayList<int[]> up = new ArrayList<int[]>();
		ArrayList<int[]> down = new ArrayList<int[]>();
		ArrayList<int[]> left = new ArrayList<int[]>();
		ArrayList<int[]> right = new ArrayList<int[]>();
		for (int i = 0; i < N; i++) {
			int x = sc.ni();
			int y = sc.ni();
			char c  = sc.next().charAt(0);
			int[] pair = new int[] {x,y,c};
			if (c=='U')
				up.add(pair);
			else if (c=='D')
				down.add(pair);
			else if (c=='L')
				left.add(pair);
			else
				right.add(pair);
		}
		int ans = INF;
		PriorityQueue<int[]> pq1 = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] arr1, int[] arr2) {
				return arr1[0]-arr2[0];
			}
		});
		PriorityQueue<int[]> pq2 = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] arr1, int[] arr2) {
				return arr2[0]-arr1[0];
			}
		});
		
		//UR
		for (int[] pair: up)
			pq1.add(pair);
		for (int[] pair: right)
			pq1.add(pair);
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		while (!pq1.isEmpty()) {
			int[] pair = pq1.poll();
			int val = pair[1]+pair[0];
			if (pair[2]=='U') {
				if (hm.containsKey(val)) {
					int diff = Math.abs(pair[0]-hm.get(val));
					ans = Math.min(ans,diff);
				}
			} else {
				hm.put(val, pair[0]);
			}
		}
		//UL
		for (int[] pair: up)
			pq2.add(pair);
		for (int[] pair: left)
			pq2.add(pair);
		hm = new HashMap<Integer,Integer>();
		while (!pq2.isEmpty()) {
			int[] pair = pq2.poll();
			int val = pair[1]-pair[0];
			if (pair[2]=='U') {
				if (hm.containsKey(val)) {
					int diff = Math.abs(hm.get(val)-pair[0]);
					ans = Math.min(ans,diff);
				}
			} else {
				hm.put(val, pair[0]);
			}
		}
		//DR
		for (int[] pair: down)
			pq1.add(pair);
		for (int[] pair: right)
			pq1.add(pair);
		hm = new HashMap<Integer,Integer>();
		while (!pq1.isEmpty()) {
			int[] pair = pq1.poll();
			int val = pair[1]-pair[0];
			if (pair[2]=='D') {
				if (hm.containsKey(val)) {
					int diff = Math.abs(pair[0]-hm.get(val));
					ans = Math.min(ans,diff);
				}
			} else {
				hm.put(val, pair[0]);
			}
		}
		
		//DL
		for (int[] pair: down)
			pq2.add(pair);
		for (int[] pair: left)
			pq2.add(pair);
		hm = new HashMap<Integer,Integer>();
		while (!pq2.isEmpty()) {
			int[] pair = pq2.poll();
			int val = pair[1]+pair[0];
			if (pair[2]=='D') {
				if (hm.containsKey(val)) {
					int diff = Math.abs(hm.get(val)-pair[0]);
					ans = Math.min(ans,diff);
				}
			} else {
				hm.put(val, pair[0]);
			}
		}
		
		
		int ans2 = INF;
		//UD
		TreeSet<Integer>[] ts = new TreeSet[200001];
		for (int[] pair: down) {
			if (ts[pair[0]]==null) {
				ts[pair[0]] = new TreeSet<Integer>();
			}
			ts[pair[0]].add(pair[1]);
		}
		for (int[] pair: up) {
			if (ts[pair[0]]!=null) {
				Integer collision = ts[pair[0]].higher(pair[1]);
				if (collision != null) {
					int diff = Math.abs(collision-pair[1]);
					ans2 = Math.min(ans2, diff);
				}
			}
		}
		//LR
		for (int i = 0; i <= 200000; i++)
			ts[i] = null;
		for (int[] pair: right) {
			if (ts[pair[1]]==null) {
				ts[pair[1]] = new TreeSet<Integer>();
			}
			ts[pair[1]].add(pair[0]);
		}
		for (int[] pair: left) {
			if (ts[pair[1]]!=null) {
				Integer collision = ts[pair[1]].lower(pair[0]);
				if (collision != null) {
					int diff = Math.abs(pair[0]-collision);
					ans2 = Math.min(ans2, diff);
				}
			}
		}

		int finalAns = Math.min(10*ans, 5*ans2);
		if (finalAns >= INF) {
			pw.println("SAFE");
		} else {
			pw.println(finalAns);
		}
		
		pw.close();
	}
	
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        }
        
        int ni() { 
            return Integer.parseInt(next()); 
        }
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() {
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str;
        }
    }
}