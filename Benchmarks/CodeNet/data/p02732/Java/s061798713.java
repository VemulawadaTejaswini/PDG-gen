import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] times = new int[n];

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            times[a[i] - 1]++;
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (times[i] != 0) {
                sum += (times[i] * (times[i] - 1) / 2);
            }
        }

        for (int i = 0; i < n; i++) {
            if (times[a[i] - 1] > 1){
                System.out.println(sum - (times[a[i] - 1] * (times[a[i] - 1] - 1) / 2) + ((times[a[i] - 1] - 1) * (times[a[i] - 1] - 2) / 2));
                continue;
            }

            System.out.println(sum);
        }

        sc.close();
    }

}