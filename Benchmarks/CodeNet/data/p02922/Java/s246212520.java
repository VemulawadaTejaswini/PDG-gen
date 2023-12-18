import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;

        while (A * ans - (ans - 1) < B) {
            ans++;
        }
        System.out.println(ans);
    }
}