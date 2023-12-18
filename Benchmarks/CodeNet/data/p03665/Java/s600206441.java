import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //long mod = (long)Math.pow(10,9) + 7;
        long n = sc.nextLong();
        int p = sc.nextInt();
        boolean isOdd = false;
        for(long i = 0; i < n; i++){
            if(sc.nextInt() % 2 != 0){
                isOdd = true;
            }
        }
        if(isOdd){
            System.out.println((long)rep2(2,n)/2L);
        }else{
            System.out.println(p == 0 ? (long)rep2(2,n) : 0);
        }
    }
    
    private static long rep2(long b, long n){
        if(n == 1) return b;
        if(n % 2 == 0){
            return (long)Math.pow(rep2(b,n/2), 2);
        }else{
            return (long)Math.pow(rep2(b,n/2), 2)*b;
        }
    }
}