import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] flag = new int[2];
		flag[0] = -1;
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		Integer[] amount = new Integer[m];
		for(int i = 0; i < m; i++){
			amount[i] = sc.nextInt();
		}
		sc.nextLine();

		/* ?????????????????? */
		Arrays.sort(amount, Comparator.reverseOrder());
		
		int minCoins = coinChange(n, amount, flag, 0);
		System.out.println(flag[1]);
		
	}

	public static int coinChange(int n, Integer[] amount, int[] flag, int depth){
		if(n < 0){
			return 0;
		}else if(n == 0){
			if(flag[0] == 1){
				return 0;
			}else{
				flag[0] = 1;
				flag[1] = depth - 1;
				return 1;
			}
		}else{
			for(int i = 0; i < amount.length; i++){
				int ret = coinChange(n - amount[i], amount, flag, depth + 1);
				if(ret == 1 ){
					break;
				}
			}
			return 1;
		}
	}
}