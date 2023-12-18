import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int N = inputs.nextInt();
		//holds all the sums!!!!
		int[][] ans = new int[N][3];
		int one = inputs.nextInt();
		int two = inputs.nextInt();
		int tre = inputs.nextInt();
		ans[0][0] = one;
		ans[0][1] = two;
		ans[0][2] = tre;
		for(int i=1;i<N;i++) {
			one = inputs.nextInt();
			two = inputs.nextInt();
			tre = inputs.nextInt();
			ans[i][0] = Math.max(ans[i-1][1], ans[i-1][2])+one;
			ans[i][1] = Math.max(ans[i-1][0], ans[i-1][2])+two;
			ans[i][2] = Math.max(ans[i-1][1], ans[i-1][0])+tre;
		}
		int fin = Math.max(ans[N-1][0], ans[N-1][1]);
		fin = Math.max(fin, ans[N-1][2]);
		System.out.println(fin);
	}

}
