
import java.util.*;	
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		if(a+w <b) ans = b-(a+w);
		else ans = a - (b+w);
		System.out.println(ans);
	}
	
}
