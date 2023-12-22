import java.util.*;
public class Main {
	public static void main(String...args) {
    	Scanner scan = new Scanner(System.in);
    	int times = scan.nextInt();
    	int[] x = new int[times];
    	int[] y = new int[times];
    	double p1   = 0;
    	double p2   = 0;
    	double p3   = 0;
    	List<Double> pMax = new ArrayList<>();
    	
    	for(int i = 0; i < 2; i++) {
    		for(int n = 0; n < times ; n++) {
    			if(i == 0) {
    				x[n] = scan.nextInt();
    			} else if(i == 1) {
    				y[n] = scan.nextInt();
    			}
    		}
    	}
		for(int m = 0; m < times ; m++) {
			double test = (x[m] - y[m]);
			test = Math.abs(test);
			pMax.add(Math.abs(test));
			p1 += Math.abs(test) ;
			p2 +=  Math.pow(Math.abs(x[m] - y[m]),2);
			p3 +=  Math.pow(Math.abs(x[m] - y[m]),3);
		}
		p2 = Math.sqrt(p2);
		p3 = Math.pow(p3 , 1.0/3.0);
		Collections.sort(pMax);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(pMax.get(pMax.size()-1));
	}
}
