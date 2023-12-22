import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long m = Long.parseLong(sc.next());
        long n = Long.parseLong(sc.next());
    
        System.out.println(pow(m, n, 1000000007));
    }
    
    static long pow(long x, long n, long M){
        if(n == 0) return 1;
        long res = pow(x * x % M, n/2, M);
        if(n%2 == 1) res = res * x % M;
        return res;
    }
}
