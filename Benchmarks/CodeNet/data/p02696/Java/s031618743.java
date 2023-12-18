import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long ans = 0;
        while(n > 0){
            if(floor(n,b) == 0){
                ans = floor(a*n,b) - a * floor(n, b);
                break;
            }
            n--;
        }
        System.out.println(ans);
    }

    static long floor(long x,long num){
        return x/num;
    }  
}