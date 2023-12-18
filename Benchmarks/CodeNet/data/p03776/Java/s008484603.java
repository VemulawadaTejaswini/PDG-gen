import java.util.*;
public class Main {
    public static long gcd(long x,long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static long lcm(long x,long y){                                                              
        return x*y/gcd(x,y);                                                                                                                                                                                                                
    }
    public static long fac(long x){
        if(x==0) return 1;
        return x*fac(x-1);
    }
    public static long per(long x,long y){
        return fac(x)/fac(x-y);      
    }
    public static long com(long x,long y){
        return per(x,y)/fac(y);      
    }
    public static long com2(long x,long y){
        if(y==0) return 1;
        if(y==x) return 1;
        return com2(x-1,y-1)+com2(x-1,y);
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		long [] in = new long [a];
        double d = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }
		Arrays.sort(in);
        long e = 0;
        long f = 0;
        long g = 0;
        for(int i=0;i<b;i++){d+=in[a-i-1];                                               
                            }
        d/=b;
        for(int i=0;i<a;i++){if(in[i]==in[a-b]){f++;if(i>=a-b){g++;}}
                            }
        long h = (long)b;
        long j = (long)c;
        if(d==in[a-1]){for(long i=h;i<=j;i++){e+=com(f,i);}}
        else{e=com(f,g);}
		System.out.println(d);
        System.out.println(e);
	}
}
