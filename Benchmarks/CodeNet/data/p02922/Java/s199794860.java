import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == b) {
            System.out.println(1);
            System.exit(0);
        }
        int div = b%(a-1);
        int ans = b/(a-1);
        if (div <= 1) {
            System.out.println(ans);
            System.exit(0);
        }
        System.out.println(ans+1);
    }
}
