import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 1;
		for(int i=0; i<n; i++){
			long a = sc.nextLong();
			ans = ans*a;
		}
		if(ans > 1_000_000_000_000_000_000L){
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}
