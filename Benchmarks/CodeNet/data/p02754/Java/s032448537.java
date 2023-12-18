import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long mix = A+B;
        
        if (mix < N) {
            System.out.println(A);
        } else if (mix%N == 0) {
            System.out.println(A * (mix/N));
        } else {
            System.out.println((A * (mix/N)) + (N-mix));
        }
    }
}