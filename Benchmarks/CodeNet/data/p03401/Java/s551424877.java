import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        int memo_x = 0;
        int memo_expence = 0;
        for (int i = 0; i < n; i++) {
            int x = memo_x;
            int expence = memo_expence;
            memo_expence = Math.abs(memo_x - a[i]);
            memo_x += a[i];
            for (int j = i + 1; j < n; j++) {
                expence += Math.abs(x- a[j]);
                x = a[j];
            }
            System.out.println(expence + Math.abs(x));
        }
    }
}
