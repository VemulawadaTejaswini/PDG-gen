import java.util.Scanner;

public class Main {
    static int N;
    static int B;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();
    }


    public static void main(String[] args) {
        init();
        if(N - (B * 2) <= 0) {
            System.out.println(0);
        } else {
            System.out.println(N - (B * 2));
        }
    }
}