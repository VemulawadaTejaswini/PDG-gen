import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken())-1;
            int y1 = Integer.parseInt(st.nextToken())-1;
            int x2 = Integer.parseInt(st.nextToken())-1;
            int y2 = Integer.parseInt(st.nextToken())-1;

            char[][] c = new char[n][m];
            for(int i=0 ; i<n ; i++) {
                c[i] = br.readLine().toCharArray();
            }

            boolean[][] vis = new boolean[n][m];

            PriorityQueue<Pair> ll = new PriorityQueue<>(16, (o1, o2) -> o1.z-o2.z);
            ll.add(new Pair(x1, y1, 0));
            vis[x1][y1] = true;
            int ans = -1;
            while(!ll.isEmpty()) {

                Pair p = ll.poll();
                int x = p.x;
                int y = p.y;

                if(x == x2 && y == y2) {
                    ans = p.z;
                    break;
                }

                for(int i=p.x-1 ; i>=0 ; i--) {
                    if(vis[i][y] || c[i][y] == '@') {
                        break;
                    }
                    else {
                        vis[i][y] = true;
                        int dis = (x-i+k-1)/k;
                        ll.add(new Pair(i, y, p.z+dis));
                    }
                }

                for(int i=p.x+1 ; i<n ; i++) {
                    if(vis[i][y] || c[i][y] == '@') {
                        break;
                    }
                    else {
                        vis[i][y] = true;
                        int dis = (i-x+k-1)/k;
                        ll.add(new Pair(i, y, p.z+dis));
                    }
                }

                for(int j=p.y-1 ; j>=0 ; j--) {
                    if(vis[x][j] || c[x][j] == '@') {
                        break;
                    }
                    else {
                        vis[x][j] = true;
                        int dis = (y-j+k-1)/k;
                        ll.add(new Pair(x, j, p.z+dis));
                    }
                }

                for(int j=p.y+1 ; j<m ; j++) {
                    if(vis[x][j] || c[x][j] == '@') {
                        break;
                    }
                    else {
                        vis[x][j] = true;
                        int dis = (j-y+k-1)/k;
                        ll.add(new Pair(x, j, p.z+dis));
                    }
                }
            }

            pw.println(ans);

        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}

class Pair {
    int x;
    int y;
    int z;
    Pair(int a, int b, int c) {
         x = a;
         y = b;
         z = c;
    }

    @Override
    public String toString() {
        return " [ " + x + " " + y +  " " + z + " ] ";
    }
}
