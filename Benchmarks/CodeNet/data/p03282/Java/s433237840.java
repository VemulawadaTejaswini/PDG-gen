import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length()==1) {
			System.out.println(s);
			return;
		}
		long k = sc.nextLong();
		long len = 0;
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			int temp = c[i]-'0';
			len += (long) Math.pow(temp, 5*Math.pow(10, 15));
			if(len >= k) {
				System.out.println(temp);
				break;
			}
		}
	}
}