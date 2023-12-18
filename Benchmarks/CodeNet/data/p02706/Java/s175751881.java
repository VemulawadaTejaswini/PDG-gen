import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[m];
        int sum = 0;
        for(int i=0; i<m; i++) {
            a[i] = in.nextInt();
            sum += a[i];
        }
        System.out.println((n-sum < 0) ? -1 : (n-sum));
    }
}
