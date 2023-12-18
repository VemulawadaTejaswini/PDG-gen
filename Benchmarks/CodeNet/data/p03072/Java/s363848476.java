import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.next());

        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(s.next());
        }

        int tmp = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (tmp <= h[i]) {
                c++;
                tmp = h[i];
            }
        }
        System.out.println(c);
    }
}