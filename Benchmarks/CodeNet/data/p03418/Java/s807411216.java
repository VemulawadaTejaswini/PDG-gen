import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long count = 0;
        if (k == 0) {
            count = n * n;
        } else if (k == n - 1) {
            count = 1;
        } else {
            for (int a = k; a <= n; a++) {
                for (int b = k + 1; b <= a; b++) {
                    if (k <= a % b) {
                        count++;
                    }
                }
                count += n - a;
            }
        }
        System.out.println(count);
    }
    
}
