
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Long> array = new ArrayList<Long>();
		for (int i=0;i<10;i++) {
			for (int j=2;j<=10;j++) {
				array.add(j*(long)Math.pow(10, i)-1);
			}
		}

		for (int i=11;i<=100;i++) {
			if (digits(i-1)>=10) {
				array.add(i*(long)Math.pow(10, 10)-1);
			}
		}
		
		for (int i=11;i<=15;i++) {
			for (int j=11;j<=100;j++) {
				array.add(j*(long)Math.pow(10, i)-1);
			}
		}
		
		long k = sc.nextLong();
		for (int i=0;i<k;i++) {
			System.out.println(array.get(i));
		}
	}

	public static int digits(long x) {
		int ans = 0;
		while (x>0) {
			ans += x%10;
			x /= 10;
		}
		return ans;
	}


}
