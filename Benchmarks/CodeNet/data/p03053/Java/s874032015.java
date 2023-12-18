import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		FastReader scan = new FastReader();
		int n = scan.nextInt(), m = scan.nextInt();
		TreeMap<Integer, TreeSet<Integer>> aa = new TreeMap<>();
		TreeMap<Integer, TreeSet<Integer>> bb = new TreeMap<>();
		int max = 0;
		char[][] b = new char[n][m];
		for(int i = 0; i < n; i++) {
			String s = scan.next();
			for(int j = 0; j < m; j++) {
				if(s.charAt(j) == '#') {
					if(aa.containsKey(i)) aa.get(i).add(j);
					else {
						TreeSet<Integer> t = new TreeSet<>();
						t.add(j);
						aa.put(i, t);
					}
					if(bb.containsKey(j)) bb.get(j).add(i);
					else {
						TreeSet<Integer> t = new TreeSet<>();
						t.add(i);
						bb.put(j, t);
					}
				}
				b[i][j] = s.charAt(j);
			}
		}
//		for(Integer i : aa.get(5)) System.out.println(i);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(b[i][j] == '.') {
					int min = Integer.MAX_VALUE;
					Integer a = aa.ceilingKey(i);
					if(a != null) {
						Integer c = aa.get(a).ceiling(j);
						Integer d = aa.get(a).floor(j);
						if(c != null) {
							min = Math.min(min, dist(i, j, a, c));
						}
						//if(i == 4 && j == 5) System.out.println(dist(i, j, a, d));
						if(d != null) {
							min = Math.min(min, dist(i, j, a, d));
						}
					}
					a = aa.floorKey(i);
					if(a != null) {
						Integer c = aa.get(a).ceiling(j);
						Integer d = aa.get(a).floor(j);
						if(c != null) {
							min = Math.min(min, dist(i, j, a, c));
						}
						if(d != null) {
							min = Math.min(min, dist(i, j, a, d));
						}
					}
					a = aa.lowerKey(i);
					if(a != null) {
						Integer c = aa.get(a).ceiling(j);
						Integer d = aa.get(a).floor(j);
						if(c != null) {
							min = Math.min(min, dist(i, j, a, c));
						}
						if(d != null) {
							min = Math.min(min, dist(i, j, a, d));
						}
					}
					a = aa.higherKey(i);
					if(a != null) {
						Integer c = aa.get(a).ceiling(j);
						Integer d = aa.get(a).floor(j);
						if(c != null) {
							min = Math.min(min, dist(i, j, a, c));
						}
						if(d != null) {
							min = Math.min(min, dist(i, j, a, d));
						}
					}
					a = bb.floorKey(j);
					if(a != null) {
						Integer c = bb.get(a).ceiling(i);
						Integer d = bb.get(a).floor(i);
						if(c != null) {
							min = Math.min(min, dist(i, j, c, a));
						}
						if(d != null) {
							min = Math.min(min, dist(i, j, d, a));
						}
					}
					a = bb.ceilingKey(j);
					if(a != null) {
						Integer c = bb.get(a).ceiling(i);
						Integer d = bb.get(a).floor(i);
						if(c != null) {
							min = Math.min(min, dist(i, j, c, a));
						}
						if(d != null) {
							min = Math.min(min, dist(i, j, d, a));
						}
					}
					a = bb.higherKey(j);
					if(a != null) {
						Integer c = bb.get(a).ceiling(i);
						Integer d = bb.get(a).floor(i);
						if(c != null) {
							min = Math.min(min, dist(i, j, c, a));
						}
						if(d != null) {
							min = Math.min(min, dist(i, j, d, a));
						}
					}
					a = bb.floorKey(j);
					if(a != null) {
						Integer c = bb.get(a).ceiling(i);
						Integer d = bb.get(a).floor(i);
						if(c != null) {
							min = Math.min(min, dist(i, j, c, a));
						}
						if(d != null) {
							min = Math.min(min, dist(i, j, d, a));
						}
					}
					max = Math.max(max, min);
				}
			}
		}
		System.out.println(max);

	}
	
	static int dist(int a, int b, int c, int d) {
		return Math.abs(a-c) + Math.abs(b-d);
	}
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }

}
