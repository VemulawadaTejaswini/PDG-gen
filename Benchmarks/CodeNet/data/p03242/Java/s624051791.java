import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 10 - (n / 100);
        int b = 10 - ((n % 100) / 10);
        int c = 10 - (n % 10);
        int ans = a * 100 + b * 10 + c;

        System.out.println(ans);
    }
}