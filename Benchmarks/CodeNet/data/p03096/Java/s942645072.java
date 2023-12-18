
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(scanner.next());
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            int b = a[i];
            boolean diff = false;
            for (int j = i; j < a.length; j++) {
                if (b != a[j])
                    diff = true;
                if (j != i && b == a[j] && diff) {
                    count++;
                    diff = false;
                }
            }
        }

        System.out.println(count % 1000000007);
    }
}