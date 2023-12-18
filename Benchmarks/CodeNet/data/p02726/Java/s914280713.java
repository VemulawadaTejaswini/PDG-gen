import java.util.*;

public class Main {
    static int INF=100000;
    public static int abs(int a){
        return (a>0)?a:(-a);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] D=new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                D[i][j]=INF;
            }
        }
        D[N-1][N-1]=0;
        
        for(int i=0;i<N-1;i++){
            D[i][i]=0;
            D[i][i+1]=1;
            D[i+1][i]=1;
        }
        
        int X=sc.nextInt();
        int Y=sc.nextInt();
        
        D[X-1][Y-1]=1;
        D[Y-1][X-1]=1;
        
        boolean change=true;
        
        while(change){
            change=false;
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(j<N-1&&D[i][j]>D[i][j+1]+1){
                        D[i][j]=D[i][j+1]+1;
                        change=true;
                    }
                    if(j>0&&D[i][j]>D[i][j-1]+1){
                        D[i][j]=D[i][j-1]+1;
                        change=true;
                    }
                    if(i<N-1&&D[i][j]>D[i+1][j]+1){
                        D[i][j]=D[i+1][j]+1;
                        change=true;
                    }
                    if(i>0&&D[i][j]>D[i-1][j]+1){
                        D[i][j]=D[i-1][j]+1;
                        change=true;
                    }
                }
            }
            
            if(!change){
                break;
            }
        }
        
        int[] DIST=new int[N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                DIST[D[i][j]]++;
            }
        }
        
        for(int i=1;i<N;i++){
            System.out.println(DIST[i]/2);
        }
    }
}
