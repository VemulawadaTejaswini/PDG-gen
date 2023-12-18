import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        long x = a[0];
        for(int i = 1; i < n; i++){
            x = lcm(x, a[i]);
        }
        x--;
        
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += x % a[i];
        }
        System.out.println(ans);
    }
    
    static long gcd(long a, long b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
    
    static long lcm(long a, long b){
        return (a / gcd(a, b)) * b;
    }
}