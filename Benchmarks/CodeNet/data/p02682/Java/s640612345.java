import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int k = in.nextInt();
		int total =0;
		total += Math.min(a, k);
		k -= Math.min(a, k);
		if (k==0) {
			System.out.println(total);}
		else {
			k-= Math.min(b, k);
			if (k==0) {
				System.out.println(total);}
			else {
				total -= Math.min(c, k);
				k -= Math.min(c, k);
				System.out.println(total);}}
	}
	
}