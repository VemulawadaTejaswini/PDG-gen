import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        final int N = s.nextInt();
        long result = 1;

        for (int i = 0 ; i < N ; i++) {
            result = result * s.nextLong();

            if (result > 1000000000000000000l) {
                System.out.println(-1);
                return;
            }
        }
            System.out.println(result);
    }
}