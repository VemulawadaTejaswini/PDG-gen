import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> outValue = Arrays.asList(1, 6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049);

    public static void main(String[] args) {

//        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        scanner.close();

        int count = 0;

        while (N > 0) {
            N = outValue(N);
//            System.out.println(N);
            count++;
            if (N == 0) {
                break;
            }
        }

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }

    private static int outValue(int N) {
        for (int i = 11; i >= 0; i--) {
            int x = outValue.get(i);
            int y = (i == 0) ? 1 : outValue.get(i - 1);
            if (N >= x) {
                if (x == 9 && (N - x) <= 5 && (N - x) > 2) {
                    return N - y;
                }
                return N - x;
            }
        }
        return 0;
    }
}