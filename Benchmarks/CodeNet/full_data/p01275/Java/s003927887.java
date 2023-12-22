import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int dfs(final int n, int deep, int[] array, int[] ans){
		//System.out.println(n + " " + deep + " " + Arrays.toString(array) + " " + Arrays.toString(ans));
		
		if(n == deep){
			return 0;
		}else if(array[deep] == ans[deep]){
			return dfs(n, deep + 1, array, ans);
		}else {
			final int diff = ans[deep] - array[deep];
			int ret = Integer.MAX_VALUE;
			
			for(int k = deep + 1; k <= n; k++){
				for(int i = deep; i < k; i++){
					array[i] = (10 + array[i] + diff) % 10;
				}
			
				ret = Math.min(ret, dfs(n, deep + 1, array, ans));
			
				for(int i = deep; i < k; i++){
					array[i] = (10 + array[i] - diff) % 10;
				}
			}
			
			return ret + 1;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];
		int[] ans   = new int[10];
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			char[] input1 = sc.next().toCharArray();
			for(int i = 0; i < n; i++){
				array[i] = input1[i] - '0';
			}
			
			char[] input2 = sc.next().toCharArray();
			for(int i = 0; i < n; i++){
				ans[i] = input2[i] - '0';
			}
			
			System.out.println(dfs(n, 0, array, ans));
			
		}

	}

}