import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] n2 = new int[200000];

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            n2[a[i]]++;
        }

        long sum = 0;

        for (int i = 0; i < 200000; i++) {
            if (n2[i] != 0) {
                sum += (n2[i] * (n2[i] - 1) / 2);
            }
        }

        for (int i = 0; i < n; i++) {
            if (n2[a[i]] > 1){
                System.out.println(sum - (n2[a[i]] * (n2[a[i]] - 1) / 2) + ((n2[a[i]] - 1) * (n2[a[i]] - 2) / 2));
                continue;
            }

            System.out.println(sum);
        }

        sc.close();
    }

}