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
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = (b-a+1)/c;
        if(a%c+(b-a+1)%c-1>=c||(a%c==0 &&(b-a+1)%c!=0)){e++;}
        long f = (b-a+1)/d;
        if(a%d+(b-a+1)%d-1>=d||(a%d==0 &&(b-a+1)%d!=0)){f++;}
        long g = (b-a+1)/lcm(c,d);
        if(a%lcm(c,d)+(b-a+1)%lcm(c,d)-1>=lcm(c,d)||(a%lcm(c,d)==0 &&(b-a+1)%lcm(c,d)!=0)){g++;}
		System.out.println(b-a+1-e-f+g);
	}
}
