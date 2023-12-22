import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double a = (Math.pow(x2,2) - Math.pow(x1,2) + Math.pow(y2,2) - Math.pow(y1,2)) * (y3 - y1);
			double b = (Math.pow(x3,2) - Math.pow(x1,2) + Math.pow(y3,2) - Math.pow(y1,2)) * (y2 - y1);
			double p = (a-b) / ((x2-x1) * (y3-y1) - (x3-x1) * (y2-y1)) / 2;
			double aa = (Math.pow(x3,2) - Math.pow(x1,2) + Math.pow(y3,2) - Math.pow(y1,2)) * (x2 - x1);			
			double bb = (Math.pow(x2,2) - Math.pow(x1,2) + Math.pow(y2,2) - Math.pow(y1,2)) * (x3 - x1);
			double q = (aa-bb) / ((y3-y1) * (x2-x1) - (y2-y1) * (x3-x1)) / 2;
			double r = Math.sqrt(Math.pow(Math.abs(p-x1), 2) + Math.pow(Math.abs(q-x2), 2));
			System.out.println(Math.floor(p*1000)/1000 + " " + Math.floor(q*1000)/1000 + " " + Math.floor(r*1000)/1000);
		}
	}
}