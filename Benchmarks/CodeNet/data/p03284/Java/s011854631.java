import java.util.Scanner;

class Main {
    public static void main(String... args) {        
        int N = IN.nextInt();
        int K = IN.nextInt();
        if (N % K == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
    final static Scanner IN = new Scanner(System.in);
}