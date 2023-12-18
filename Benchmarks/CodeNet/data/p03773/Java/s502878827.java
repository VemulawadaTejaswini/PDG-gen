import java.util.*;

public class At710 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int ans = A + B;
        if (0 <= ans && ans <= 24) {
            System.out.print(ans);
        }
        if (ans > 24) {
            System.out.print(ans - 24);
        }
        if (ans < 0) {
            ans = ans * -1;
            System.out.print(ans);
        }
    }
}