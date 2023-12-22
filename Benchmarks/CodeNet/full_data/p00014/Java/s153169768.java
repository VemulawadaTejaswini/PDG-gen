import java.util.*;
public class Main {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			int d = s.nextInt();
			int ans = 0;
			for (int i=d;i<=600-d;i+=d) {
				ans += d * i * i;
			}
			System.out.println(ans);
		}
	}

}

