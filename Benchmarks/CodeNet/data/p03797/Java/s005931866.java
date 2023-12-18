import java.util.Scanner;

/**
 * https://abc055.contest.atcoder.jp/tasks/arc069_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		sc.close();
		
		long ans = 0;
		if(N*2>=M){
			ans = M/2;
		}else{
			ans = N + (M-N*2)/4;
		}
		System.out.println(ans);

	}

}