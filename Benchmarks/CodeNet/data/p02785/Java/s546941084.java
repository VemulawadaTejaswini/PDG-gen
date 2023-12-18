import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] mons = new int[M];
        for(int i=0; i<M; i++){
            mons[i] = sc.nextInt();
        }
        long ans = 0;
        Arrays.sort(mons);
        for(int j=0; j<(M-K); j++){
            ans += mons[j];
        }
        System.out.println(ans);
    }
}
