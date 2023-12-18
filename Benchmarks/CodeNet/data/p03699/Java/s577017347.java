import java.util.Arrays;
import java.util.Scanner;

public class Bugged {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int total = 0;
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.nextInt();
            total += s[i];
        }
        Arrays.sort(s);

        if (total % 10 != 0) {
            System.out.println(total);
        } else {
            for (int i = 0 ; i < n ; i++) {
                int temp = total - s[i];
                if (temp % 10 != 0 ) {
                    System.out.println(temp);
                    return;
                }
            }
            System.out.println(0);
        }

    }

}