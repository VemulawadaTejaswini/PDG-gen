import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int result = 0;
            for (int j = 0; j < n;j++) {
                if (a[j] > result && i != j) {
                    result = a[j];
                }
            }
            System.out.println(result);
        }
    }
}
