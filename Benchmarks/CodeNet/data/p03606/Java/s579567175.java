import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int sum = 0;
		int l = 0;
		for(i=0;i<n;i++) {
			l = parseInt(sc.next());
			sum += parseInt(sc.next()) - l + 1;
		}
		sc.close();
		out.println(sum);
	}
}
