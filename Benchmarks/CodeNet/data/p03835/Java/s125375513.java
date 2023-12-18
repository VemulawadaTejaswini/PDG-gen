
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b,ans = 0;
		int k = sc.nextInt();
		int s = sc.nextInt();
		int[] a = new int[k+1];
		for(int i = 0;i < k+1;i++)a[i] = i;
		for(int i = 0;i < k+1;i++) {
			b = s - a[i];
			if(i % 2 == 0) ans += b+1;
			else ans += b;
		}
		System.out.println(ans);
	}

}
