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
		int x = parseInt(sc.next());
		sc.close();
		int mx = 0;
		if(x<4) {
			mx=1;
		} else {
			int sq = (int)sqrt(x);
			double sisu=0.0;
			int jo=0;
			for (i = 2; i <= sq; i++) {
				sisu = floor(log((double)x)/log((double)i));
//				out.printf("%d:%f%n", i,sisu);
				jo=(int)pow((double)i,sisu);
				if(jo>mx)mx=jo;
			}
		}
		out.println(mx);
	}
}
