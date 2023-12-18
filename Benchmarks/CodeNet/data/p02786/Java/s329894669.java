import java.util.*;  

public class Main {
	public static Long ln(Long x){
        if(x<=1) return x;                                                          
        return 1+2*ln(x/2);                                                                                                                                                                                                                
    }
    public static Long gcd(Long x,Long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
        Long b = ln(a);
		System.out.println(b);   
	}   
}

