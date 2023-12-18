import java.util.*;
public class Main{
	public static void main(String[] argv){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int[] tree = new int[N];
		for(int i=0;i<N;i++)
			tree[i] = in.nextInt();
		int ans = Integer.MAX_VALUE;
		Arrays.sort(tree);
		for(int i=0;i<N-K+1;i++){
			ans = Math.min(ans, tree[i+K-1]-tree[i]);
		}
		System.out.println(ans);
	}
}