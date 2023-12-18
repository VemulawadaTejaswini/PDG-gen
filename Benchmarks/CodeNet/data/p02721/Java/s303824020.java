
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();

		char[] str = sc.next().toCharArray();
		int dp[] = new int[n];

		for(int i = 0; i < n; i++){
			if(str[i] == 'o'){
				if(i <= c){
					dp[i] = 1;
				}
				else {
					dp[i] = dp[i - c - 1] + 1;
				}
			}
			else {
				if(i == 0){
					dp[i] = 0;
				}
				else {
					dp[i] = dp[i - 1];
				}
			}

//			System.out.print(dp[i]+" ");
		}
//		System.out.println();

		if(dp[n - 1] > k){
			return;
		}

		Stack<Integer> stack = new Stack<Integer>();

		int current;
		int count = 0;
		int latestIndex = -1;
		int firstIndex = -1;
		for(int i = n - 1; i >= 0; i--){
			current = dp[i];
//			System.out.println("i = "+i+ " number "+current);

			if(str[i] == 'o'){
				count++;
				latestIndex = i;
				if(firstIndex == -1){
					firstIndex = i;
				}
			}

			if(i == 0 || dp[i - 1] != current){
				if(count == 1){
					stack.add(latestIndex + 1);
				}
				count = 0;
				if(i != 0){
//					i -= c;

					i = Math.min(i, firstIndex - c);
				}
				firstIndex = -1;

			}
		}

		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}

}
