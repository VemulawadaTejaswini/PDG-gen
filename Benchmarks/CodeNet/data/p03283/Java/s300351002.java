import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();
        int Q=sc.nextInt();
    
        int[][] map=new int[N+1][N+1];
        for(int i=0;i<M;i++){
            map[sc.nextInt()][sc.nextInt()]++;
        }

   
        for(int i=0;i<=N;i++){
            for(int j=0;j<=N;j++){
                map[i][j]+=map[i][j-1];
        }
    }
    for(int i=0;i<Q;i++){
        int p=sc.nextInt();
        int q=sc.nextInt();
        if(q>p){
            int tmp=p;
            p=q;
            q=tmp;
        }
        int ans=0;
        for(int k=p;k<=q;k++){
            ans+=map[k][q]-map[k][p-1];
        }
    System.out.println(ans);
    }

}
}