import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int r = in.nextInt();
        int c = in.nextInt(); in.nextLine();
        int area = r*c;
        int[] dx = {0,-1,0,1};
        int[] dy = {-1,0,1,0};
        char[][] map = new char[r][c];
        int blackSquares = 1;
        for( int i = 0; i < r; i++ ) {
            String l = in.nextLine();
            for( int j = 0; j < c; j++ ) {
                map[i][j] = l.charAt(j);
                if(map[i][j]=='#') blackSquares++;
            }
        }

        PriorityQueue<Node> q = new PriorityQueue<>();
        int[][] distance = new int[r][c];
        for( int[] i : distance ) Arrays.fill(i,-1);
        q.add(new Node(0,0,0));
        distance[0][0] = 0;
        
        while(!q.isEmpty()) {
            Node curr = q.remove();
            for( int i = 0; i < 4; i++ ) {
                int x = curr.r + dx[i];
                int y = curr.c + dy[i];
                if( x < 0 || x >= r || y < 0 || y >= c ) continue;
                int temp = 1+curr.distance;
                if( distance[x][y] == -1 || distance[x][y] > temp) {
                    distance[x][y] = temp;
                    q.add(new Node(x,y,distance[x][y]));
                }
            }
        }
        System.out.println((area-blackSquares)-distance[r-1][c-1]);
    }
    static class Node implements Comparable<Node>{
        int r,c;
        int distance;
        public Node(int r, int c, int distance) {
            this.r = r;
            this.c = c;
            this.distance = distance;
        }
        public int compareTo(Node n) {
            return distance - n.distance;
        }
    }
}