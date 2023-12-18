
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrays = new int[N];

        for (int i = 0; i < N; i++) {
            arrays[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            int[] subarray = Arrays.copyOfRange(arrays, 0, i);
            if (subarray.length == 0) {
                result++;
                continue;
            }

            Arrays.sort(subarray);
            if (subarray[0] >= arrays[i]) {
                result++;
            }
        }

        System.out.println(result);
    }
}
