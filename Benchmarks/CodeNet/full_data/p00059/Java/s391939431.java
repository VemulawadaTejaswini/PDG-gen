import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			double[] x = new double[4];
			double[] y = new double[4];
			for(int i=0;i<4;i++){			
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			
			if(x[0]>x[3] || x[2]>x[1] || y[0]>y[3] || y[2]>y[1]) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}