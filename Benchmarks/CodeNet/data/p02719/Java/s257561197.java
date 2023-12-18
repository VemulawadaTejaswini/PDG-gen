import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        double K = sc.nextDouble();
        
        double result1=N%K;
        double result2=K-result1;

        if (result1<result2) {
            System.out.println((int)result1);
        } else {
            System.out.println((int)result2);
        }

    }
}