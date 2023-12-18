import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Here your code !
        Scanner in = new Scanner(System.in);
        String N = in.next();
        String K = in.next();
        int n = Integer.parseInt(N);
        int k = Integer.parseInt(K);
        
        int result = 0;
        result = k;
        if (n == 1) {
            System.out.println(result);
        } else {
            for (int i = 1; i <= n -1; i++) {
                result = result * (k - 1);
            }
        }
        System.out.println(result);
    }
}
