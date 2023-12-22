import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextInt();
        long N = 0;
        long ans = -1;

        for(long i=1; i<=8; i++ ) {
            N = (N*10+1);
            if(K==7*N){
                ans = i;
                break;
            }
        }
        N = 0;
        for(long i=1; i<=K && ans == -1; i++ ) {
            N = (N*10+1)%K;
            if (N == 0){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
