import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int[] a = new int[N];
        int sum = 0;
        
        a[0] = scanner.nextInt();
        for(int i = 1; i < N; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        
        int x = a[0];
        for(int i = 1; i < N; i++) {
            if(Math.abs(x - sum) > Math.abs(x + 2 * a[i] - sum)) {
                x += a[i];
                sum -= a[i];
            } else {
                System.out.println(Math.abs(x - sum));
                return;
            }
        }
        
    }
}