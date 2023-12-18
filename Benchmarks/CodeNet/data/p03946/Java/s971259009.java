import java.util.Scanner;

/**
 * https://abc047.contest.atcoder.jp/tasks/arc063_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++) a[i] = sc.nextInt();
		sc.close();
		int[] maxDp = new int[N];
		maxDp[N-1] = a[N-1];
		for(int i=N-2; i>=0; i--){
			maxDp[i] = Math.max(a[i], maxDp[i+1]);
		}
		
		int max = 0;
		int count = 0;
		for(int i=0; i<N-1; i++){
			int s = maxDp[i+1]-a[i];
			if(s==max){
				count++;
			}else if(s>max){
				max = s;
				count = 1;
			}
		}
		System.out.println(Math.min(count, T));

	}

}