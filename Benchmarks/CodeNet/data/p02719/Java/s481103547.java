import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        double K = sc.nextDouble();
        
        double result1=N%K;
        double result2=Math.abs(K-result1);

        System.out.println((int)Math.min(result1, result2));
    }
}