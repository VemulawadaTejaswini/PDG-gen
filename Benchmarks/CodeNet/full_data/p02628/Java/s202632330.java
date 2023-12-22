import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] p = new int[n];

        Arrays.setAll(p, x -> scan.nextInt());
        Arrays.sort(p);

        int sum = 0;
        for (int x = 0; x < k; x++) {
            sum += p[x];
        }

        System.out.println(sum);
    }
}