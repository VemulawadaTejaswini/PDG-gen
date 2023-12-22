import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int q = cin.nextInt();
			if(q==-1){
				break;
			}
			double eps = 0.00001*q;
			double x = q/2;
			while(true){
				if(Math.abs(Math.pow(x, 3)-q) < eps){
					break;
				}
				x = x-(Math.pow(x, 3)-q) / (3*Math.pow(x, 2));
			}
			x = x*1000000;
			x = (int)x;
			x = x/1000000;
			System.out.println(x);
		}

	}

}