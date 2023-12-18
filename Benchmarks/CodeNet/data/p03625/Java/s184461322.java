import java.util.Arrays;
import java.util.Scanner;

/**
 * http://abc071.contest.atcoder.jp/tasks/arc081_a
 */
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(a);
		int max = 0;
		for(int i=N-1; i>0; i--){
			if(a[i]==a[i-1]){
				max = a[i];
				a[i]= -1;
				a[i-1] = -1;
				break;
			}
		}
		
		Arrays.sort(a);
		int max2 = 0;
		for(int i=N-1; i>0; i--){
			if(a[i]==a[i-1]){
				max2 = a[i];
				break;
			}
		}
		
		System.out.println(max*max2);

	}

}
