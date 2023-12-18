import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int toZero = 0;
        int toN = 0;
        Integer a[] = new Integer[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            if (a[i] < x) {
                toZero++;
            } else {
                toN++;
            }
        }
        System.out.println(Math.min(toZero, toN));
    }
}
