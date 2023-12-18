import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int curr = ar[0];
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < n - 1; i++) {
            result.append(curr);
            result.append(' ');
            result.append(ar[i]);
            curr = curr - ar[i];
            result.append('\n');
        }
        result.append(ar[n - 1]);
        result.append(' ');
        result.append(curr);
        System.out.println(ar[n - 1] - curr);
        System.out.println(result.toString());
    }
}
