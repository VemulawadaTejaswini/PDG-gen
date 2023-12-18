import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        long N = 7L;// Long.parseLong(sc.nextLine());
        String[] arr = { "14", "14", "2", "13", "56", "2", "37" };// sc.nextLine().split(" ");
        Long[] numArray = Arrays.stream(arr).map(Long::parseLong).toArray(Long[]::new);
        // sc.close();

        long min = Long.MAX_VALUE;

        for (int i = 1; i <= 100; i++) {
            long value = 0L;
            for (int l = 0; l < N; l++) {
                long x = numArray[l];
                long val = (long) Math.pow((x - i), 2);
                value += val;
            }
            if (value < min) {
                min = value;
            }
        }

        System.out.println(min);
    }
}