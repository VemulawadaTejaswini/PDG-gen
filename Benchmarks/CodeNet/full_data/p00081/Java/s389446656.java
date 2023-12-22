import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			Scanner sd = new Scanner(s.replaceAll(",", " "));
			double x1 = sd.nextDouble();
			double y1 = sd.nextDouble();
			double x2 = sd.nextDouble();
			double y2 = sd.nextDouble();
			double xq = sd.nextDouble();
			double yq = sd.nextDouble();
			double x, y, d, e;
			
			if(x1==x2){
				y = yq;
				x = 2*x1 - xq;
			}else if(y1==y2){
				x = xq;
				y = 2*y1 - yq;
			}else{
				d = (y2-y1)/(x2-x1);
				e = y1-d*x1;
				x = (2*yq*d-2*d*e+xq-d*d*xq)/(d*d+1);
				y = (xq-x)/d+yq;
			}
			System.out.println(x + " " + y);
		}
	}	
}