
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int[] count = new int[4];
        for (int i = 0; i < 3; i++) {
            count[a[i] - 1]++;
            count[b[i] - 1]++;
        }
        int a1 = 0;
        int a2 = 0;

        for (int i = 0; i < 4; i++) {
            if (count[i] == 1)
                a1++;
            if (count[i] == 2)
                a2++;
        }

        if (a1 == 2 && a2 == 2)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

}
