import java.util.*;
public class Main {
	
    public static long gcd(long x,long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static long lcm(long x,long y){                                                              
        return x*(y/gcd(x,y));                                                                                                                                                                                                                
    }
    public static long com(long x,long y){
        if(x<=1 || y==0 || y==x) return 1; 
        return com(x-1,y-1) + com(x-1,y);
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
        long ans = 0;
        if((x+y)%3==0 && y<=x/2 && y<=2*x){long n = (x+y)/3; 
                                           long k = x-n;
                                          ans = com(n,k);}
		System.out.println(ans);
	}
}
