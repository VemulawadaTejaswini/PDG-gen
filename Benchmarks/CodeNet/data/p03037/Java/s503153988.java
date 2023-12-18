import java.util.*;
import java.lang.*;

public class Main {

    static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int left = 1, right = N;
        for(int m=0; m<M; m++){
            left = Math.max(left, sc.nextInt());
            right = Math.min(right, sc.nextInt());
        }
        System.out.println(Math.max(right-left+1, 0));
    }
}