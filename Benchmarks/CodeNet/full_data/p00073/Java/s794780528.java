import static java.lang.Math.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("########.000000");
		while(sc.hasNext()){
			int x = sc.nextInt();
			int h = sc.nextInt();
			if((x == 0 && h == 0) || (x > 100 || h > 100)) break;
			double sh = sqrt(pow(0.5*x,2) + pow(h,2));
			double S = pow(x,2) + 4*(0.5*x*sh);
			System.out.println(df1.format(S));
		}
	}
}