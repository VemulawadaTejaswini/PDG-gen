import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = 0;
		long a = 0;
		long r = 0;
		long c = 0;
		long h = 0;
		
		for (int i = 0; i < n; i++) {
			char fc = sc.next().charAt(0);
			switch (fc) {
				case 'm':
					m++;
					break;
				case 'a':
					a++;
					break;
				case 'r':
					r++;
					break;
				case 'c':
					c++;
					break;
				case 'h':
					h++;
					break;
			}
		}
		System.out.println(r*c*h + a*c*h + a*r*h + a*r*c + m*c*h + m*r*h + m*r*c + m*a*h + m*a*c + m*a*r);
	}
}