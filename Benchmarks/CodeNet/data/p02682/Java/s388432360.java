import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();
        long ans = 0;
        if(a+b>=k){ans=Math.min(a,k);}
        else{ans=a-(k-a-b);}
		System.out.println(ans);
	}
}
