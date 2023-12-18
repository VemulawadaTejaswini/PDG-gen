import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] x = new int[3];
		for(int i=0;i<3;i++) {
			x[i] = in.nextInt();
		}
		Arrays.sort(x);
		int ans = 0;
		if((x[2]-x[1])%2==0) {
			if((x[2]-x[0])%2==0) {
				ans += (x[2]-x[1])/2;
				ans += (x[2]-x[0])/2;
			}else {
				ans += (x[2]-x[1])/2;
				ans += (x[2]-x[0])/2;
				ans += 2;
			}
		}else {
			if((x[2]-x[0])%2==0) {
				ans += (x[2]-x[1])/2;
				ans += (x[2]-x[0])/2;
				ans += 2;
			}else {
				ans += (x[2]-x[1])/2;
				ans += (x[2]-x[0])/2;
				ans += 1;
			}
		}
		System.out.println(ans);
		in.close();
		

	}

}
