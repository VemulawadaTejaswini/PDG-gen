import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(help(n,a,b));
    }
    static long help(long n, long a, long b){
        if(a>b) return 0;
        if(n==1) return a==b?1:0;
        if(n==2) return 1;
        return (n-2)*(b-a)+1;
    }
}
