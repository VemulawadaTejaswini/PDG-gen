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
			double newz= Math.floor(z);
			int check = (int) Math.pow(newz, 5);
			if(check ==  p) {
				if(flag == false) System.out.println(cur + " -" + (int) Math.ceil(z));
				else System.out.println(cur + " " + (int) Math.ceil(z));
				break;
			}
			cur += 1;
		}
	}
} 
