import java.util.*;
public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String __[]){
		solve(
				s.nextInt(),
				s.nextInt(),
				s.nextInt()
				);
	}
	private static final void solve(int a,int b,int c) {
		if((a%2)*(b%2)*(c%2)%2==0) {
			System.out.println(0);
			return;
		}
		long[] ar = {a,b,c};
		Arrays.sort(ar);
		System.out.println(ar[0]*ar[1]);
	}
}
