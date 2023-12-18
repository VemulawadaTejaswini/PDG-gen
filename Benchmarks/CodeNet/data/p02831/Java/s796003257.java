import java.util.*;

class Main{
    //148c
    static final int DIV = 100000007;
    static final int MAX = 2000000000;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long ans = lcm(a,b);
        System.out.println(ans);
    }
    static long lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    static long gcd(int a,int b){
        if(b < a)return gcd(b,a);
        if(b==0)return a;
        return gcd(b,a%b);
    }
}