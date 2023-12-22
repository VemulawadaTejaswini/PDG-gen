
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double[] x,y;
			x = new double[4];
			y = new double[4];
			for(int i=0;i<4;i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			
			if(isNotTyouhuku(x, y)) System.out.println("NO");
			else System.out.println("YES");
		}
	}
	
	boolean isNotTyouhuku(double[]x , double[] y) {
		return x[1] < x[2] || x[0] > x[3] || y[1] < y[2] || y[0] > y[3]; 
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}