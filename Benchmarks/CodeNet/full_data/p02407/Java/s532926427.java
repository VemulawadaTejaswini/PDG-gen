import java.util.Scanner;

/**
 * Created by malone on 2018/3/16.
 */
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        System.out.printf("\n");
        int[] a = new int[n];

        for (int i = 0; i <n ; i++) {
            a[i] = scanner.nextInt();
        }
        int max ;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if (a[j]>a[i]) {
                    max = a[i];
                    a[i] = a[j];
                    a[j] = max;
                }
            }
            System.out.printf("%d ", a[i]);
        }
    }
}

