import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int D = in.nextInt();
		int X = in.nextInt();
		
		int[] ans = new int[11];
		ans[0] = X;
		
		for(int i = 1;i < 11;i++) {
			ans[i] = ans[i-1]*N-D;
			System.out.println(ans[i]);
		}
	}
}