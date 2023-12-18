import java.util.*;

class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] cap = new long[5];
        for(int i = 0; i < 5; i++) cap[i] = sc.nextLong();
        long max = 0;
        for(int i = 0; i < 5; i++){
            max = Math.max((n + cap[i] - 1) / cap[i], max);
        }
        System.out.println(max + 4);
    }
}