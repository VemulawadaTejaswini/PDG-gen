import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String s = "";
		boolean minus = n<0;
		if(minus)n*=-1;
		while(n > 0) {
			System.out.println(n);
			if(n%2 == 1) {
				s = '1' + s;
				if(minus) {
					n++;
				}else {
					n--;
				}
			} else {
				s = '0' + s;
			}
			minus = !minus;
			n/=2;
		}
		if(s.length() == 0) {
			System.out.println(0);
		} else {
			System.out.println(s);
		}
	}
}
