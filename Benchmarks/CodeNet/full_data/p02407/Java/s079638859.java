import java.util.Scanner;

/**
 * ReverseNumber
 */
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = a.length - 1; i > 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println(a[0]);

        sc.close();
    }
}
