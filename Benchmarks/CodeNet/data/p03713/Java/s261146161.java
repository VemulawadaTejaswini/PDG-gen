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
		int hmod = h % 3;
		switch(hmod) {
		case 0:
			ans = 0;
			break;
		default:
			if(w % 2 == 0) {
				ans = w/2;
			} else {
				ans = (w + (h - h/3 - 1))/2;
			}
			break;
		}
		int ans1 = 100000;
		int wmod = w % 3;
		switch(wmod) {
		case 0:
			ans1 = 0;
			break;
		default:
			if(h % 2 == 0) {
				ans1 = h/2;
			} else {
				ans1 = (h + (w - w/3 - 1))/2;
			}
			break;
		}
		ans = Math.min(ans, ans1);
		out.println(ans);
	}
}
