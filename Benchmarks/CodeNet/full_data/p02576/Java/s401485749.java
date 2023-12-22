import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long X = sc.nextLong();
		long T = sc.nextLong();
		long ans = N/X;
		if(N%X>0){
		    ans++;
		}
		System.out.println(ans*T);
	}
}
