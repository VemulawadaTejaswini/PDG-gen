
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a[] = new int [n + 1];



        for (int i = 1 ; i < n + 1 ; i++) {
            int count = 0;
            int b = i;
            while (b < k) {
                count++;
                b *= 2;
            }
            a[i] = count;
        }

        double ans = 0;
        for (int i = 1 ; i < n + 1 ; i++) {

            ans += Math.pow(2, -a[i]);
        }
        System.out.println(ans / n);

    }

}