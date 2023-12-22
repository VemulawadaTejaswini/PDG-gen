
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double x[] = new double[3];
			double y[] = new double[3];
			String[] str = sc.next().split(",");
			for(int i=0;i<3;i++) {
//				System.out.println(str[2*i] + " " + str[1] + " " + x[i] + " " + y[i]);
				x[i] = Double.parseDouble(str[2*i]);
				y[i] = Double.parseDouble(str[2*i+1]);
//				System.out.println(str[0] + " " + str[1] + " " + x[i] + " " + y[i]);
			}
			double dx = x[1]-x[0];
			double dy = y[1]-y[0];
			double rety = (x[2]-2*x[0]) * dx * dy - (y[2]-2*y[0]) * dx * dx
							+ dy * dx * x[2] + dy * dy * y[2];
			double retx = (y[2]-2*y[0]) * dx * dy - (x[2]-2*x[0]) * dy * dy
							+ dx * dx * x[2] + dx * dy * y[2];
			rety /= dx*dx+dy*dy;
			retx /= dx*dx+dy*dy;
			System.out.println(retx + " " + rety);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}