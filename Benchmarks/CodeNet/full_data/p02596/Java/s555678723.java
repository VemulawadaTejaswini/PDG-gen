import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = 0;
        int ans = -1;
        for(int i=1; i<=K; i++ ) {
            N = (N*10+1)%K;
            if (N == 0){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
