import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        for(int i=1;i<=N;i++){
            A[i]=sc.nextInt();
        }
        int idx=2;
        int ans=0;
        while(idx<=N){
            if(A[idx]==A[idx-1]){
                ans++;
                idx++;
            }
            idx++;
        }
        System.out.println(ans);
    }
}
