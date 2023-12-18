import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        long max = lcm(n,m);
        long spow = max/n;
        long tpow = max/m;
        for(int i = 0; i < n; i++){
            long index = i*spow;
            if(i == 0 || index % tpow == 0){
                if(s.charAt(i) != t.charAt((int)(index/tpow))){
                    System.out.println(-1);
                    return;
                }
            }else{
                continue;
            }
        }
        System.out.println(max);
    }
    
    private static long gcd(long a, long b){
        while (b > 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static long lcm(long a, long b){
        return a * (b / gcd(a, b));
    }

}
