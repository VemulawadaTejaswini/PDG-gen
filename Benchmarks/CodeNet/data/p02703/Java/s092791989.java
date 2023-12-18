import java.util.*;

public class Main {
    static long longinf=1000000000000L;
    static int inf=1000000007;
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int S=sc.nextInt();
        long[] time=new long[N];
        long[] needcoin=new long[N];
        long[] minD=new long[N];
        long[] minC=new long[N];
        int[] start=new int[M];
        int[] goal=new int[M];
        int[] A=new int[M];
        int[] B=new int[M];
        int[] C=new int[N];
        int[] D=new int[N];
        int[][] root=new int[N][N];
        int[] rootidx=new int[N];
        int[][] train=new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                root[i][j]=-1;
            }
            root[i][0]=0;
            rootidx[i]=1;
        }
        
        for(int i=0;i<M;i++){
            start[i]=sc.nextInt()-1;
            goal[i]=sc.nextInt()-1;
            A[i]=sc.nextInt();
            B[i]=sc.nextInt();
            train[start[i]][goal[i]]=A[i];
            train[goal[i]][start[i]]=A[i];
        }
        
        for(int i=0;i<N;i++){
            C[i]=sc.nextInt();
            D[i]=sc.nextInt();
        }
        
        for(int i=0;i<N;i++){
            time[i]=longinf;
            needcoin[i]=longinf;
            minD[i]=longinf;
            minC[i]=longinf;
        }
        time[0]=0;
        needcoin[0]=0;
        
        for(int i=0;i<M;i++){
            int st=start[i];
            int go=goal[i];
            int a=A[i];
            int b=B[i];
            
            if(time[go]>time[st]+b){
                time[go]=time[st]+b;
                needcoin[go]=needcoin[st]+a;
                for(int j=0;j<N;j++){
                    root[go][j]=root[st][j];
                    if(root[st][j]==-1){
                        root[go][j]=go;
                        break;
                    }
                }
            }
        }
        
        for(int i=1;i<N;i++){
            long changetime=longinf;
            for(int j=0;j<N;j++){
                if(root[i][j]==-1){
                    break;
                }
                int crtnode=root[i][j];
                long crtexchangetime=(needcoin[i]-S+C[crtnode]-1)/C[crtnode];
                if(changetime>crtexchangetime*D[crtnode]){
                    changetime=crtexchangetime*D[crtnode];
                }
            }
            System.out.println(time[i]+changetime);
        }

    }
}
