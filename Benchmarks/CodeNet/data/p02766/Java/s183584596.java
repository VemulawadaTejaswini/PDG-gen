import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int digit = 1;
        int num = N;
        while((num /= K) != 0) digit++;

        System.out.println(digit);
    }
}