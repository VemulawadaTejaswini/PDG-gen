//A
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] P = new int[5];

		int ans = 0;

		int p = 1000;

		int q = 1000;

		for(int i=0;i<5;i++) {

			P[i] = sc.nextInt();

			q = P[i]%10;

			if(q<p && q!=0) p = q;

			if(q!=0)ans += P[i]+(10-q);

			else ans += P[i];
		}

		System.out.println(ans+p-10);
	}

}
