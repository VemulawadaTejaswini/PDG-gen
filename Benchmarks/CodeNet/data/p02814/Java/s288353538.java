import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        long a = Long.parseLong(sc.next());
        for(int i = 1; i < n; i++){
            a = lcm(a, Integer.parseInt(sc.next()));
        }
        
        System.out.println((m+a/2)/a);
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