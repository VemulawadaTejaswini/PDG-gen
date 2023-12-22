import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d = sc.nextLong();
		int count =0;
		for (int i =0;i<n;i++) {
			long x = sc.nextLong();
			long y =sc.nextLong();
			double power = (Math.sqrt(Math.pow(x, 2) +Math.pow(y, 2)));
			if(x*x+y*y<=d*d) {
				count++;}}
		System.out.println(count);

	}

}
