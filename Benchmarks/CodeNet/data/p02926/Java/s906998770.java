import java.io.*; 
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int[][] edges = new int[N][2];
        for (int i = 0; i < N; i++) {
        	edges[i][0] = sc.nextInt();
        	edges[i][1] = sc.nextInt();
        }
        //Quadrant 1 Rush
        int x1 = 0;
        int y1 = 0;
        boolean[] visited1 = new boolean[N];
        for (int i = 0; i < N; i++) {
        	if (edges[i][0] >= 0 && edges[i][1] >= 0) {
        		visited1[i] = true;
        		x1 += edges[i][0];
        		y1 += edges[i][1];
        	} else if (edges[i][0] <= 0 && edges[i][1] <= 0) {
        		visited1[i] = true;
        	}
        }

        for (int i = 0; i < N; i++) {
        	if (visited1[i])
        		continue;
    		int newX = x1 + edges[i][0];
    		int newY = y1 + edges[i][1];
        	if (edges[i][0] >= 0 && edges[i][1] <= 0) {
        		if (newX >= 0 && newY >= 0 && (distance(x1,y1) < distance(newX,newY))) {
        			x1 = newX;
        			y1 = newY;
        		}
        	} else if (edges[i][0] <= 0 && edges[i][1] >= 0) {
        		if (newX >= 0 && newY >= 0 && (distance(x1,y1) < distance(newX,newY))) {
        			x1 = newX;
        			y1 = newY;
        		}
        	}
        }
        
        //Quadrant 2 Rush
        int x2 = 0;
        int y2 = 0;
        boolean[] visited2 = new boolean[N];
        for (int i = 0; i < N; i++) {
        	if (edges[i][0] <= 0 && edges[i][1] >= 0) {
        		visited2[i] = true;
        		x2 += edges[i][0];
        		y2 += edges[i][1];
        	} else if (edges[i][0] >= 0 && edges[i][1] <= 0) {
        		visited2[i] = true;
        	}
        }

        for (int i = 0; i < N; i++) {
        	if (visited2[i])
        		continue;
    		int newX = x2 + edges[i][0];
    		int newY = y2 + edges[i][1];
        	if (edges[i][0] >= 0 && edges[i][1] >= 0) {
        		if (newX <= 0 && newY >= 0 && (distance(x2,y2) < distance(newX,newY))) {
        			x2 = newX;
        			y2 = newY;
        		}
        	} else if (edges[i][0] <= 0 && edges[i][1] <= 0) {
        		if (newX <= 0 && newY >= 0 && (distance(x2,y2) < distance(newX,newY))) {
        			x2 = newX;
        			y2 = newY;
        		}
        	}
        }
        
        //Quadrant 3 Rush
        int x3 = 0;
        int y3 = 0;
        boolean[] visited3 = new boolean[N];
        for (int i = 0; i < N; i++) {
        	if (edges[i][0] <= 0 && edges[i][1] <= 0) {
        		visited3[i] = true;
        		x3 += edges[i][0];
        		y3 += edges[i][1];
        	} else if (edges[i][0] >= 0 && edges[i][1] >= 0) {
        		visited3[i] = true;
        	}
        }

        for (int i = 0; i < N; i++) {
        	if (visited3[i])
        		continue;
    		int newX = x3 + edges[i][0];
    		int newY = y3 + edges[i][1];
        	if (edges[i][0] <= 0 && edges[i][1] >= 0) {
        		if (newX <= 0 && newY <= 0 && (distance(x3,y3) < distance(newX,newY))) {
        			x3 = newX;
        			y3 = newY;
        		}
        	} else if (edges[i][0] >= 0 && edges[i][1] <= 0) {
        		if (newX <= 0 && newY <= 0 && (distance(x3,y3) < distance(newX,newY))) {
        			x3 = newX;
        			y3 = newY;
        		}
        	}
        }
        
        //Quadrant 4 Rush
        int x4 = 0;
        int y4 = 0;
        boolean[] visited4 = new boolean[N];
        for (int i = 0; i < N; i++) {
        	if (edges[i][0] >= 0 && edges[i][1] <= 0) {
        		visited4[i] = true;
        		x4 += edges[i][0];
        		y4 += edges[i][1];
        	} else if (edges[i][0] <= 0 && edges[i][1] >= 0) {
        		visited4[i] = true;
        	}
        }

        for (int i = 0; i < N; i++) {
        	if (visited4[i])
        		continue;
    		int newX = x4 + edges[i][0];
    		int newY = y4 + edges[i][1];
        	if (edges[i][0] <= 0 && edges[i][1] <= 0) {
        		if (newX >= 0 && newY <= 0 && (distance(x4,y4) < distance(newX,newY))) {
        			x4 = newX;
        			y4 = newY;
        		}
        	} else if (edges[i][0] >= 0 && edges[i][1] >= 0) {
        		if (newX >= 0 && newY <= 0 && (distance(x4,y4) < distance(newX,newY))) {
        			x4 = newX;
        			y4 = newY;
        		}
        	}
        }
        
        
        //Answer
        System.out.println(Math.max(Math.max(distance(x1,y1),distance(x2,y2)),Math.max(distance(x3,y3),distance(x4,y4))));
    }
    
    public static double distance(int x, int y) {
    	return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
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
  
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() { 
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