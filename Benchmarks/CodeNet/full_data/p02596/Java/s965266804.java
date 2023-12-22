import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextInt();
        long N = 0;
        long ans = -1;
        for(long i=1; i<=K; i++ ) {
            N = (N*10+1)%K;
            if (N == 0){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
