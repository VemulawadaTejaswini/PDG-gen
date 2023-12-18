import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long max = sc.nextInt();
		long val = sc.nextInt();
		long ans = (long) Math.pow(Math.floor((double) max / val), 3);
		if(val % 2 == 0) {
			ans += (long) Math.pow(Math.floor((double) (max + val * 0.5) / val), 3);
		}
		System.out.println(ans);
	}
}