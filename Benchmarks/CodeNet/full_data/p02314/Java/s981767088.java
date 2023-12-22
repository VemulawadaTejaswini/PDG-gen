import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		int[] map = new int[50000];
		for(int i = 0; i < 50000; i++){
			map[i] = -1;
		}
		
		Integer[] amount = new Integer[m];
		for(int i = 0; i < m; i++){
			amount[i] = sc.nextInt();
		}

		/* ?????????????????? */
		Arrays.sort(amount, Comparator.reverseOrder());

		int[] flag = new int[2];
		flag[0] = n;
		int ret = coinChange(n, amount, map, flag, 0);
		System.out.println(flag[0]);
		
	}

	public static int coinChange(int n, Integer[] amount, int[] map, int[] flag, int depth){
		if(n < 0){
			return 0;
		}else if(n == 0){
			if(flag[0] > depth){
				flag[0] = depth;
			}
			return 1;
		}else if(map[n] > -1){
			return map[n];
		}else{
			int sum = 0;
			for(int i = 0; i < amount.length; i++){
				sum += coinChange(n - amount[i], amount, map, flag, depth + 1);
			}
			map[n] = sum;
			return map[n];
		}
	}
}