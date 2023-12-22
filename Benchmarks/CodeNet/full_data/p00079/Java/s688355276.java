
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	void run() {
		Scanner sc = new Scanner(System.in);
		double s = 0;
		double[] x = new double[3];
		double[] y = new double[3];
		String[] str = sc.next().split(",");
		x[0] = Double.parseDouble(str[0]);
		y[0] = Double.parseDouble(str[1]);
		str = sc.next().split(",");
		x[2] = x[1] = Double.parseDouble(str[0]);
		y[2] = y[1] = Double.parseDouble(str[1]);
		
		while(sc.hasNext()) {
			x[1] = x[2];
			y[1] = y[1];
			str = sc.next().split(",");
			x[2] = Double.parseDouble(str[0]);
			y[2] = Double.parseDouble(str[1]);
			s += area( line(x, y) );
		}
		System.out.println(s);
	}
	double[] line(double[] x, double[] y) {
		double[] d = new double[3];
		for(int i=0;i<3;i++) {
			d[i] = sqrt( (x[i]-x[(i+1)%3])*(x[i]-x[(i+1)%3]) + (y[i]-y[(i+1)%3])*(y[i]-y[(i+1)%3]) );
		}
		return d;
	}
	
	double area(double[] d) {
		double len = d[0] + d[1] + d[2];
		return sqrt( len * (len-d[0]) * (len-d[1]) * (len-d[2]) );
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}