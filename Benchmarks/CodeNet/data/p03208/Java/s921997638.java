import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int N,K;
	static int[] trees;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 K = sc.nextInt();
		 trees = new int[N];

		 int[] heights = new int[N-1];

		 for(int i = 0 ; i < N ; i++){
			 trees[i] = sc.nextInt();
			 }
		 sc.close();

		 Arrays.sort(trees);

		 for(int i = 0 ; i < N-1 ; i++){
			 heights[i]= trees[i+1]-trees[i];
			 //System.out.println(heights[i]);
		 }
		 Arrays.sort(heights);

		 int ans = 0 ;
		 for(int i = 0 ; i < K-1 ; i++){
			 ans += heights[i];
		 }
		 System.out.println(ans);
	}
}