import java.util.*;

public class Main {
    static int INF=100000;
    public static int abs(int a){
        return (a>0)?a:(-a);
    }
    
    public static int min(int a,int b){
        return (a>b)?b:a;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] D=new int[N][N];
        int[][] Duse=new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                D[i][j]=abs(i-j);
            }
        }
        
        int X=sc.nextInt();
        int Y=sc.nextInt();
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Duse[i][j]=abs(i-X+1)+abs(j-Y+1)+1;
            }
        }
        
        int[][] min=new int[N][N];
        int[] ans=new int[N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                min[i][j]=min(D[i][j],Duse[i][j]);
            }
        }
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                min[i][j]=min(min[i][j],min[j][i]);
            }
        }
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                ans[min[i][j]]++;
            }
        }
        
        for(int i=1;i<N;i++){
            System.out.println(ans[i]/2);
        }
    }
}
