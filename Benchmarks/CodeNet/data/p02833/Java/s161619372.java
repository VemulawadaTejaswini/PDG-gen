import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        if(N % 2 == 1) {
            System.out.println(0);
            return;
        }
        long ans = 0;
        for(long n = N/10; n > 0; n /=10) {
            ans += n;
        }
        
        System.out.println(ans);
    }
}
