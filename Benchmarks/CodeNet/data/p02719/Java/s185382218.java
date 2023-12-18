import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long remainder = N % K;
        long residual = K - remainder;
        if (remainder < residual) {
            System.out.println(remainder);
        } else {
            System.out.println(residual);
        }
    }
}