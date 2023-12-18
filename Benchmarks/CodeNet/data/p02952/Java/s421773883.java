import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int keta = 0;
		int num = n;
		int ans = 0;
		while (num > 0) {
			num /= 10;
			keta++;
		}
		for(int i = 1; i < keta; i = i + 2) {
			int x = 1;
			for(int j = 0; j < i; j++) {
				x *=10;
			}
			ans = ans + (x - (x / 10));
		}
		if (keta % 2 == 1) {
			int x = 1;
			for(int i = 1; i < keta; i++)
				x *= 10;
			ans = ans + ( n - x) + 1;
		}
		out.println(ans);

	}
}