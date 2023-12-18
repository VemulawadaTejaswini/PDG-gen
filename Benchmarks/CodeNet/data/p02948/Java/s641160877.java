import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Math.max;
import static javax.print.attribute.standard.MediaSizeName.A;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] ab = new int[n][2];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            ab[i][0] = scanner.nextInt();
            ab[i][1] = scanner.nextInt();
        }
        Arrays.sort(ab, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(ab, Comparator.comparingInt(a -> a[1]));


        for (int i = n-1; i >= 0 ; i--) {
            if(m >= ab[i][0]) {
                sum += ab[i][1];
                m--;
            }
            if(m < 1) {
                break;
            }

        }
        System.out.println(sum);

    }

}

