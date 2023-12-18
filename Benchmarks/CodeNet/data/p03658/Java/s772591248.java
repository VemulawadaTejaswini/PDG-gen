import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] L = new int[N];
        for(int i=0;i<N;i++) L[i]=sc.nextInt();
        Arrays.sort(L);
        int ans = 0;
        for(int i=N-1;i>=N-K;i--) ans += L[i];
        System.out.println(ans);
    }
}
