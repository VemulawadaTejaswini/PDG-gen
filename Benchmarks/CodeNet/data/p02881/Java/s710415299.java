import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        long y = N;
        long a = 1;
        long b = 1;
        boolean toggle = true;

        if(N > 83094340) {
            System.out.println(N-1);
        }

        for (long i = 2; N > i; i++) {
            while ((y % i) == 0) {
                y = y / i;
                if(toggle){
                    a *= i;
                }else{
                    b *= i;
                }
                toggle = !toggle;
            }
        }
        System.out.println(a + b - 2);
    }
}