import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int[] p = new int[w];
		for (int i=0;i<w;i++) {
			p[i]=sc.nextInt();
		}

		int[] q = new int[h];
		for (int j=0;j<h;j++) {
			q[j]=sc.nextInt();
		}

		Arrays.sort(p);
		Arrays.sort(q);

		int i=0;
		int j=0;


		long ans = 0;

		while (i<w || j<h) {
			if(i>=w || (j<h && p[i]>q[j])) {
				//draw a vertical line
				ans += (q[j]*(w+1-i));
				j++;

			} else {
				//draw a horizontal line
				ans += (p[i]*(h+1-j));
				i++;

			}
		}

		System.out.println(ans);
	}

}
