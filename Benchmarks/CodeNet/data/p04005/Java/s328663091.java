import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long[] block = {a,b,c};
		long judge = a*b*c;
		long ans;
		if(judge%2==0) {
			ans = 0;
		}
		else {
			Arrays.sort(block);
			long min = block[0]*block[1]*(block[2]/2);
			long max = block[0]*block[1]*((block[2]+1)/2);
			ans = max-min;
		}
		System.out.println(ans);
	}
}