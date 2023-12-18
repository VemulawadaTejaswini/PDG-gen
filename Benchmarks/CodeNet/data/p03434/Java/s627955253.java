import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer l[] = new Integer[n];
        for (int i = 0; i < l.length; i++) {
            l[i] = s.nextInt();
        }
        Arrays.sort(l, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            if (i % 2 == 0) {
                sum = sum + l[i];
            } else {
                sum = sum - l[i];
            }
        }
        System.out.println(sum);
    }
}