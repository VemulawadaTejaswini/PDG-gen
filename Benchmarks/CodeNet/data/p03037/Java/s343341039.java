
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int left = 1;
        int right = N;
        for (int i=1; i <= M; i++) {
            int tmpLeft = scanner.nextInt();
            int tmpRight = scanner.nextInt();
            if (tmpLeft > left) {
                left = tmpLeft;
            }
            if (tmpRight < right) {
                right = tmpRight;
            }
        }

        System.out.println(right - left + 1);
    }
}