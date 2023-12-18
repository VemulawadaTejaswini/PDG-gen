import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        Queue<int[]> q = new LinkedList<>();
        int[][] adj = {{-1,0},{0,-1},{0,1},{1,0}};

        char[][] m = new char[H][W];
        int[][] dist = new int[H][W];

        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                dist[i][j]=-1;//infinity
                m[i][j] = s.charAt(j);
                if(m[i][j]=='#'){
                    int[] cord = {i,j};
                    q.add(cord);
                    dist[i][j]=0;
                }
            }
        }
        int maxDis = 0;

        while(!q.isEmpty()){
            int[] t = q.poll();
            int i= t[0];
            int j= t[1];
            int d = dist[i][j];

            for (int k = 0; k < adj.length; k++) {
                int ni=i+adj[k][0];
                int nj=j+adj[k][1];
                if(ni >=0 && ni< H && nj>=0 && nj<W &&  dist[ni][nj] == -1 ){
                    q.add(new int[]{ni,nj});
                    dist[ni][nj] = d+1;
                    maxDis = Math.max(maxDis,dist[ni][nj]);
                }
            }
        }
        System.out.println(maxDis);
    }
}
