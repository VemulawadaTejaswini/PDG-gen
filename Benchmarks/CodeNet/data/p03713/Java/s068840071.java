import java.util.*;
import static java.lang.Integer.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int h = parseInt(sc.next());
		int w = parseInt(sc.next());
		sc.close();
		int ans = 100000;
		if(h % 3 == 0) {
			ans = 0;
		} else {
			if(w % 2 == 0) {
				ans = w/2;
			} else {
				ans = w/2 + h/3 + 1;
			}
		}
		int ans1 = 100000;
		if(w % 3 == 0) {
			ans1 = 0;
		} else {
			if(h % 2 == 0) {
				ans1 = h/2;
			} else {
				ans1 = h/2 + w/3 + 1;
			}
		}
		ans = Math.min(ans, ans1);
		out.println(ans);
	}
}
