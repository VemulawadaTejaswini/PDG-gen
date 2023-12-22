import java.util.Scanner;
import java.io.IOException;
public class Main {
        private final static int WHITE=0;
        private final static int GRAY=1;
        private final static int BLACK=2;
        private static int[][] M;
        private static int n;
        public static void main(String[] args) throws IOException {
                final Scanner sc = new Scanner(System.in);
                int i,j;
                n=sc.nextInt();
                M = new int[n][n];

//??????????????????
                for(i=0;i<n;i++)
                        for(j=0;j<n;j++) M[i][j]=Integer.MAX_VALUE;
                int u,k,v,c;

                for(i=0;i<n;i++){
                        u=sc.nextInt();
                        k=sc.nextInt();
                        for(j=0;j<k;j++){
                                v=sc.nextInt();
                                c=sc.nextInt();
                                M[u][v]=c;
                        }
                }

                dicstra();

        }

        public static void dicstra(){
                int[] color = new int[n];
                int[] depth = new int[n];
                int i,j;
                for(i=0;i<n;i++){
                        depth[i]=Integer.MAX_VALUE;
                        color[i]=WHITE;
                }

                depth[0]=0;
                color[0]=GRAY;
                int mincost;
                int u;
                while(true){
                        mincost=Integer.MAX_VALUE;
                        u=-1;
                        for(i=0;i<n;i++){
                                if(color[i]!=BLACK && depth[i]<mincost){
                                        mincost = depth[i];
                                        u=i;
                                }
                        }
                        if(mincost==Integer.MAX_VALUE) break;
                        color[u]=BLACK;

                        for(j=0;j<n;j++){
                                if(color[j]!=BLACK && M[u][j]!=Integer.MAX_VALUE){
                                        if(depth[j]>depth[u]+M[u][j]){
                                                depth[j]=depth[u]+M[u][j];
                                                color[j]=GRAY;
                                        }
                                }
                        }

                }
                for(i=0;i<n;i++){
                        System.out.println(i+" " + (depth[i]==Integer.MAX_VALUE ? -1 : depth[i]));
                }
        }
}