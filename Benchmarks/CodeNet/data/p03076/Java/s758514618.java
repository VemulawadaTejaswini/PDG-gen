
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int min = 1000;
        int mini = 0;
        for (int i = 0 ; i < 5 ; i++) {
                a[i] = sc.nextInt();
                if (min > a[i] % 10 && a[i] % 10 > 0) {
                    min = Math.min(min, a[i] % 10);
                    mini = i;
                }


        }

        if (mini == 1000) {
            mini = 0;
        }

        int sum = 0;
        for (int i = 0 ; i < 5 ; i++) {
            if (i != mini) {
                if (a[i] % 10 == 0) {
                    sum += a[i];
                } else {
                    sum += (a[i] / 10 +1 ) * 10;
                }
            }

        }
        sum += a[mini];
        System.out.println(sum);

    }

}