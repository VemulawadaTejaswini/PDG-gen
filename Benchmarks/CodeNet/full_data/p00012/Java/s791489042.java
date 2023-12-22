import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		while(scan.hasNext()){
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double x3 = scan.nextDouble();
			double y3 = scan.nextDouble();
			double xp = scan.nextDouble();
			double yp = scan.nextDouble();

			double S_abc = 1.0 / 2.0 * Math.abs(x1*(y2-y3) + x2*(y3-y1)
					+ x3*(y1-y2));
			double S_pab = 1.0 / 2.0 * Math.abs(xp*(y1-y2) + x1*(y2-yp)
					+ x2*(yp-y1));
			double S_pac = 1.0 / 2.0 * Math.abs(xp*(y1-y3) + x1*(y3-yp)
					+ x3*(yp-y1));
			double S_pbc = 1.0 / 2.0 * Math.abs(xp*(y2-y3) + x2*(y3-yp)
					+ x3*(yp-y2));
			if(S_abc == S_pab + S_pac + P_pbc){
				System.out.println("YES");
			} else{
				System.out.println("NO");
			}
		}
	}
}