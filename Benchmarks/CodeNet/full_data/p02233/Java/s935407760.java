import java.util.Scanner;

public class Main {
    
    public static int Fibonacci(int n) {
        int[] fib = new int[50];
        fib[0] = fib[1] = 1;
        for(int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        System.out.println(Fibonacci(n));
    }
    
}