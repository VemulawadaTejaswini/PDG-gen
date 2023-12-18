import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] T = new int[N+1];
        for(int i=1;i<=N;i++) T[i]=sc.nextInt();
        int M = sc.nextInt();
        int[] sum = new int[N+1];
        for(int i=1;i<=N;i++) sum[i]=sum[i-1]+T[i];
        for(int i=0;i<M;i++){
            int p = sc.nextInt();
            int x = sc.nextInt();
            int ans = sum[N]-T[p]+x;
            System.out.println(ans);
        }
    }
}
