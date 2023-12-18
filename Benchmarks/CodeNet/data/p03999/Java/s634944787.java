
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int k = (int) Math.log10(n)+1;
		long ans = 0;

		for(int j=0; j<Math.pow(2, k-1); j++) {
			long tmpN = n;
			int tasInt = j|(int)(Math.pow(2, k-1));
			String tasStr = Integer.toBinaryString(tasInt);
			long tmp = tmpN%10;
			tmpN /= 10;
			int ct = 10;
			for(int i =1; i<k; i++) {
				if(tasStr.charAt(i) == '0') {
					tmp += (tmpN%10)*ct;
					tmpN /= 10;
					ct *= 10;
				}else {
					ans += tmp;
					tmp = tmpN%10;
					tmpN /= 10;
					ct = 10;
				}
			}
			ans += tmp;
		}
		System.out.println(ans);

	}
}
