import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        for(int i=1;i<=N;i++) A[i]=sc.nextInt();
        int[] rec = new int[N+1];
        for(int i=1;i<=N;i++) rec[A[i]]=i;
        int ans = N-1;
        int idx = N-1;
        while(idx>=1&&rec[idx]<rec[idx+1]) {
            ans--;
            idx--;
        }
        int ans2 = N-1;
        int idx2 = 2;
        while(idx2<=N&&rec[idx2]>rec[idx2-1]){
            ans2--;
            idx2++;
        }
        System.out.println(Math.min(ans,ans2));
    }
}