import java.io.*;
import java.util.*;

public class Main {

    static class Pair {
        int x;
        int y;
        int z;
        Pair(int a, int b, int c) {
            x = a;
            y = b;
            z = c;
        }
    }

    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x1 = sc.nextInt()-1;
            int y1 = sc.nextInt()-1;
            int x2 = sc.nextInt()-1;
            int y2 = sc.nextInt()-1;
            char[][] c = new char[n][m];
            for(int i=0 ; i<n ; i++) {
                c[i] = sc.next().toCharArray();
            }

            int[][] min = new int[n][m];
            for(int i=0 ; i<n ; i++) {
                for(int j=0 ; j<m ; j++) min[i][j] = -1;
            }

            PriorityQueue<Pair> pq = new PriorityQueue<>(16, (o1, o2) -> o1.z-o2.z);
            pq.add(new Pair(x1, y1, 0));
            while(!pq.isEmpty()) {
                Pair p = pq.poll();

                if(min[p.x][p.y] != -1) continue;
                else min[p.x][p.y] = p.z;

                for(int x=-2 ; x<=2 ; x++) {
                    for(int y=-2 ; y<=2 ; y++) {
                        if(!(x==0 && y==0)) {
                            int dx = p.x+x;
                            int dy = p.y+y;
                            if(bound(dx, dy, n, m) && min[dx][dy] == -1) {
                                if((Math.abs(x) == 1 && y == 0) || (Math.abs(y) == 1 && x == 0)) {
                                    if(c[dx][dy] != '#') pq.add(new Pair(dx, dy, p.z));
                                }
                                else {
                                    if(c[dx][dy] != '#') pq.add(new Pair(dx, dy, p.z+1));
                                }
                            }
                        }
                    }
                }
            }

            pw.println(min[x2][y2]);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }

    static boolean bound(int x, int y, int n, int m) {
        return x>=0 && x<n && y>=0 && y<m;
    }
    
    static class Reader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while(!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException io) {
                    io.printStackTrace();
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
    }
}
