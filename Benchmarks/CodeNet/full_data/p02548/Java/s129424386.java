import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int a = 1; a <= N-1; a++) {
            ans += (N-1)/a;
        }
        System.out.println(ans);
    }
}
