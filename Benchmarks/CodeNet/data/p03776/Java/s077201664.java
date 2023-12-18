import java.util.*;
public class Main {
    public static Long gcd(Long x,Long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static Long lcm(Long x,Long y){                                                              
        return x*(y/gcd(x,y));                                                                                                                                                                                                                
    }
    public static Long fac(Long x){
        if(x==0) return x+1;
        return x*fac(x-1);
    }
    public static Long per(Long x,Long y){
        return fac(x)/fac(x-y);      
    }
    public static Long com(Long x,Long y){
        return per(x,y)/fac(y);      
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		Long [] in = new Long [a];
        double d = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }
		Arrays.sort(in);
        Long e = in[0]-in[0];
        Long f = e;
        Long g = e;
        for(int i=0;i<b;i++){d+=in[a-i-1];                                               
                            }
        d/=b;
        for(int i=0;i<a;i++){if(i>=a-c && in[i]==in[a-b]){f++;if(i>=a-b){g++;}}
                            }
        if(g==e){for(Long i=g;i<=f;i++){e+=com(f,i);}}
        else{e+=com(f,g);}
		System.out.println(d);
        System.out.println(e);
	}
}
