import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long sum =0;
		int a= 0;
		int b= 0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='1') {
				if (i%2==0) {
					a++;
				} else {
					b++;
				}
			}
			if (a>b) {
				sum +=a;
			} else {
				sum +=b;
			}
		}
		System.out.println(sum);
	}
}