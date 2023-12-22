import java.util.*;
public class Main {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double[] p = new double[9];
			for(int i=1; i<=8; i++) p[i] = sc.nextDouble();	
			double dot = (p[1]-p[3])*(p[5]-p[7])+(p[2]-p[4])*(p[6]-p[8]);
			if(dot < 0.001 && dot >-0.001)	System.out.println("YES");
			else System.out.println("NO");
		}
	}

}