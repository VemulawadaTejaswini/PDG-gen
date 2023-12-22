import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[, \\r\\n]+");
		while(sc.hasNext()){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double xq = sc.nextDouble();
			double yq = sc.nextDouble();
			double ansx, ansy;

			if(y1 == y2){
				ansx = xq;
				ansy = y1 * 2 - yq;
			}
			else if(x1 == x2){
				ansx = x1 * 2 - xq;
				ansy = yq;
			}
			else{
				double pa = (y2 - y1) / (x2 - x1);
				double pb = y1 - pa * x1;
				double qa = (double)-1 / pa;
				double qb = yq - qa * xq;
				double midx = (pb - qb) / (qa - pa);
				double midy = qa * midx + qb;
				ansx = midx * 2 - xq;
				ansy = midy * 2 - yq;
			}
			System.out.printf("%1.6f %1.6f\n", ansx,ansy);
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}