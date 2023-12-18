import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] values = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            sum += value;
            values[i] = value;
        }
        Arrays.parallelSort(values);

        int index = 0;
        while (sum % 10 == 0) {
            if (index >= N) {
                sum = 0;
                break;
            }
            if (values[index] % 10 != 0) {
                sum -= values[index];
            }
            index++;
        }
        System.out.println(sum);
    }
}