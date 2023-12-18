import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		sc.close();
		String ans = "";
		if(a.length > b.length) {
			ans = "GREATER";
		} else if(a.length < b.length) {
			ans = "LESS";
		} else {
			int d = 0;
			ans = "EQUAL";
			for (i = 0; i < a.length; i++) {
				if(a[i] > b[i]) {
					ans = "GREATER";
					break;
				} else if(a[i] < b[i]) {
					ans = "LESS";
					break;
				}
			}
		}
		out.println(ans);
	}
}
