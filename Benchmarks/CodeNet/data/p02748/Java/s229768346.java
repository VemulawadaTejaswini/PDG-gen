import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int[] ref = new int[a];
        int[] chin = new int[b];
        int[] discount = new int[m];

        for (int i = 0; i < a; i++) {
            ref[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            chin[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            discount[i] = ref[sc.nextInt() - 1] + chin[sc.nextInt() - 1] - sc.nextInt();
        }

        Arrays.sort(ref);
        Arrays.sort(chin);
        Arrays.sort(discount);

        System.out.println(Math.min(discount[0], ref[0] + chin[0]));
    }
}