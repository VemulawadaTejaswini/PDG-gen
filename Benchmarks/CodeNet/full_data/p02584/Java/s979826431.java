import java.util.*;
public class Main {
    public static long mod(long x, long y){
    return x%y<0?x%y+(y<0?-y:y):x%y;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
        x = Math.abs(x);
		long k = sc.nextLong();       
        long d = sc.nextLong();
		long ans = 0;
        if(x/d>k){ans=x-d*k;}
        else{if((k-x/d)%2==0){ans=mod(x,d);}
            else{ans=d-mod(x,d);}
            }      
		System.out.println(ans);
	}
} 