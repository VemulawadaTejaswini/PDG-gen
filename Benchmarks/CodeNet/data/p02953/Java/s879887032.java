
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = in.nextInt();

        }


        for (int i = n - 2; i >= 0; i--) {

            if (a[i] > a[i+1]) {
                if (Math.abs(a[i] - a[i + 1]) > 1) {
                    System.out.println("No");
                    return;
                } else {
                    a[i]--;
                }
            }

        }

        System.out.println("Yes");

    }


}
