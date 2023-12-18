import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();
        
        long C = A+B;
        long ansA = A*(N/C);
        long ansB = Math.min(N%C, A);
        System.out.println(ansA + ansB);
        
    }
}