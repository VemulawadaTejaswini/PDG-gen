import java.util.*;
import java.math.*;
public class Main {
	static long ans = 0L;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int cur = 0; 
		while(true) {
			double p = Math.pow(cur, 5);
			p -= x;
			boolean flag = true;
			if(p < 0) {
				p *= -1;
				flag = false;
			}
			double z = Math.pow(p, 1.0 / 5);
			double newz = Double.parseDouble(String.format("%.5f", z));
			if(newz == Math.ceil(z)) {
				if(flag == false) System.out.println(cur + " -" + (int) Math.ceil(z));
				else System.out.println(cur + " " + (int) Math.ceil(z));
				break;
			}
			cur += 1;
		}
	}
} 
