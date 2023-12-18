import java.util.*;
import java.io.PrintWriter;
public class Main {
    final int MAX = 1000; 
    int[] f; 
  
    // Constructor
    public gcdOfFibonacci(){
        // Create an array for memoization 
        f = new int[MAX]; 
    } 
  
    // Returns n'th Fibonacci number using table f[]. 
    // Refer method 6 of below post for details. 
    // https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/ 
    private static int fib(int n) { 
        // Base cases 
        if (n == 0) 
            return 0; 
        if (n == 1 || n == 2) 
            return (f[n] = 1); 
  
        // If fib(n) is already computed 
        if (f[n]!=0) 
            return f[n]; 
  
        int k = ((n & 1)==1)? (n+1)/2 : n/2; 
  
        // Applying recursive formula [Note value n&1 is 1 
        // if n is odd, else 0. 
        f[n] = ((n & 1)==1)? (fib(k)*fib(k) + fib(k-1)*fib(k-1)) 
               : (2*fib(k-1) + fib(k))*fib(k); 
  
        return f[n]; 
    } 
  
    // Function to return gcd of a and b 
    private static int gcd(int M, int N) { 
        if (M == 0) 
            return N; 
        return gcd(N%M, M); 
    } 
  
    // This method returns GCD of Fib(M) and Fib(N) 
    static int findGCDofFibMFibN(int M,  int N) { 
        return fib(gcd(M, N)); 
    } 
  
    // Driver method 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        // Returns GCD of Fib(M) and Fib(N) 
        gcdOfFibonacci obj = new gcdOfFibonacci(); 
      int N = sc.nextInt();
      int K = sc.nextInt();
        System.out.println(findGCDofFibMFibN(N, K)); 
    }
}