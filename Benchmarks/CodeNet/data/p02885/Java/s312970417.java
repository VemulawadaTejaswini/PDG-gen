import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        int ans = A - 2 * B;
        System.out.println(ans > 0 ? ans: 0);
    }
}