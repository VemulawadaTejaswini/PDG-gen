import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		sc.close();
		int cnt=0;
		cnt=Math.max(0, (b-a)*(n-2)+1);
		out.println(cnt);
	}
}
