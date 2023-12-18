import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int ans = 0;
        int oneNum = Math.min(A,K);
        ans += oneNum;
        K -= oneNum;
        int zeroNum = Math.min(B,K);
        K -= zeroNum;
        int minusOneNum = Math.min(C,K);
        ans -= minusOneNum;
        System.out.println(ans);
    }
}

