import java.util.*;
public class Main {
    public static long mod(long x, long y){
    return x%y<0?x%y+(y<0?-y:y):x%y;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        long b = 1000000007;
        long sum = 0;
        long mul = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                             sum+=in[i];
                             mul+=in[i]*in[i];
                             sum=mod(sum,b);
                             mul=mod(mul,b);
                            }       
        long ans = mod(sum*sum-mul,b);
        if(ans%2==1){ans=mod(ans+b,b);}
        ans/=2;
		System.out.println(ans);
	}
}