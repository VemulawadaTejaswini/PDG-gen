import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		sc.close();
		int ans;
		if(n<=9) {
			ans = n;
		} else if(n<=99) {
				ans = 9;
		} else if(n<=999){
			ans = 9 + n-99;
		} else if(n<=9999){
			ans = 9 + 900;
		} else if(n<=99999){
			ans = 9 + 900 + n - 9999;
		} else {
			ans = 9 + 900 + 90000;
		}
		out.println(ans);
	}
}
