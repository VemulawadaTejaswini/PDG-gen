import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		int c = parseInt(sc.next());
		sc.close();
		int ans = c-(a-b);
		if(ans<0)ans=0;
		out.println(ans);
	}
}
