import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long sum =0;
		int a= 0;
		int b= 0;
		int i =0;
		int count =0;
		for (i=0;i<s.length();i++) {
			if (s.charAt(i)=='0') {
				count ++;
			} else {
				break;
			}
		}
		for (;i<s.length();i++) {
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
		if (a>b) {
			sum +=a*count;
		} else {
			sum +=b*count;
		}
		System.out.println(sum);
	}
}