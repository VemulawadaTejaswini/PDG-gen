import java.util.*;
public class Main {
    public static long pow2(long x){
        if(x==0) return 1;
        return 2*pow2(x-1);
  }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		long a = sc.nextLong();
		long b = sc.nextLong();
        long ans = 0;
        long c = b-a+1;
        long d = 0;
        while(c>0){ans+=(a/pow2(d)%2+c)%2*pow2(d);
                   c/=2;d++;}
	    System.out.println(ans);
  }
}