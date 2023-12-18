import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int x = 0;
            int expence = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    expence += Math.abs(x- a[j]);
                    x = a[j];
                }
            }
            System.out.println(expence + Math.abs(x));
        }
    }
}
