

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long q = (b/c)-((a-1)/c);
		if(q==1 && c<a) {
			q=q-1;
		}
		else {
			q=q;
		}

		long r = (b/d)-((a-1)/d);
		if(r==1 && r<a) {
			r=r-1;
		}
		else {
			r=r;
		}

		long s = (b/(c*d))-((a-1)/(c*d));
		if(r==1 && r<a) {
			s=s-1;
		}
		else {
			s=s;
		}

		System.out.println(q+r-s);

	}

}
