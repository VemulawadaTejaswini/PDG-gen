import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int result = 1;

        for (int i = 0; i < limit; i++) {
            result *= sc.nextInt();
        }
        if (result > Math.pow(10, 18)) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}