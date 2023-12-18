import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int N = gcd(a, b);
        
        int count = 1;
        if(N % 2 != 1 && N >= 2)count++;
        for(int i = 3 ; i <= N ; i+= 2) {
            boolean prime = true;
            if(a % i != 0 || b % i != 0)continue;
            for(int j = 3 ; j <= Math.sqrt(i) ; j++) {
                if(i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime)count++;
        }
        System.out.println(count);
    }
    
    public static int gcd(int a, int b) {
        if(b == 0)return a;
        return gcd(b, a % b);
    }
}