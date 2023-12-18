import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import static java.lang.Math.*;
class bridge{
	public int a;
	public int b;
	public bridge() {
		a = b = 0;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		bridge [] s = new bridge[k];
		for(int i = 0;i < k;i ++) {
			s[i] = new bridge();
			s[i].a = in.nextInt();
			s[i].b = in.nextInt();
		}
		Arrays.sort(s,new Comparator<bridge>() {
			public int compare(bridge x,bridge y) {
				if(x.a == x.b)return x.b - y.b;
				return x.a - y.a;
			}
		});
		int ans = 0,r = 0;
		for(int i = 0;i < k;i ++) {
			if(s[i].a >= r) {
				ans ++;
				r = s[i].b;
			}
			else if(r > s[i].b)r = s[i].b;
		}
		System.out.println(ans);
	}
}
