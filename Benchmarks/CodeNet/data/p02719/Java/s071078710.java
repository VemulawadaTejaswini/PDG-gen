import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		int n = v.nextInt();
		int k = v.nextInt();
		System.out.println(calc(n,k));
		
	}
	public static int calc(int n, int k) {
		if (n < k) {
			return n;
		}
		
		while(n>0) {
			n = n - k;
		}
		if(n<0) {
			n = -n;
		}
		return n;
	}
}
