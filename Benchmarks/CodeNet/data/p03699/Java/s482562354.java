import java.util.Arrays;
import java.util.Scanner;

/**
 * https://abc063.contest.atcoder.jp/tasks/arc075_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int sum = 0;
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
			sum += a[i];
		}
		sc.close();
		
		int ans = sum;
		
		if(ans%10==0){
			Arrays.sort(a);
			int n = -1;	
			for(int i=0; i<N; i++){
				if(a[i]%10!=0){
					n = a[i];
					break;
				}
			}
			ans = n==-1 ? 0 : ans-n;
		}
			
		System.out.println(ans);

	}

}