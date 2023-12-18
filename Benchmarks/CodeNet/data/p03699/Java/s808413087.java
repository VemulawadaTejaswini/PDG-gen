import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        if (sum % 10 != 0) {
            System.out.println(sum);
            return;
        } else {
            int max = 0;
            for (int i = 0; i < n; i++) {
                int plus = 0;
                for (int j = 0; j < n; j++) {
                    if (i == j) continue;
                    plus += array[j];
                }
                max = Math.max(max, plus);
            }
            if (max % 10 == 0) {
                System.out.println(0);
            } else {
                System.out.println(max);
            }
        }
    }
}
