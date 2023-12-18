import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long[] a = new long[5];
		long n = scan.nextLong();

		int i;
		for(i = 0; i < 5; i++)
			a[i] = scan.nextLong();

		long[] c = new long[6];
		c[0] = n;

		long cnt = 0;
		while(c[0] != 0 ||
				c[1] != 0 ||
				c[2] != 0 ||
				c[3] != 0 ||
				c[4] != 0) {
			cnt++;
			for(i = 5; i > 0; i--) {
				if(c[i - 1] >= a[i - 1]) {
					c[i] += a[i - 1];
					c[i - 1] -= a[i - 1];
				}else {
					c[i] += c[i - 1];
					c[i - 1] = 0;
				}
			}
		}
		System.out.println(cnt);
	}
}
