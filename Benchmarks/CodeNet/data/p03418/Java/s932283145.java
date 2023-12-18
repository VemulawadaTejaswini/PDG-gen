import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long count = 0;
        for (int a = k; a <= n; a++) {
            for (int b = 1; b <= a - 1; b++) {
                if (k <= a % b) {
                    count++;
                }
            }
            count += n - a;
        }
        System.out.println(count);
    }
    
}
