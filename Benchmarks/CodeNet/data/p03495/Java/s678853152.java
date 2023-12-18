import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		sc.nextLine();
		
		if (N == K) {
			System.out.println(0);
			return;
		}
		
		//O(N)
		int type = 0;
		boolean[] flag = new boolean[200_001];
		int[] map = new int[200_001];
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (!flag[num]) {
				flag[num] = true;
				type++;
			}
			map[num] += 1;
		}
		
		Arrays.sort(map);
		type -= K;
		int ans = 0;
		for (int i = 0; i < map.length; i++) {
			if (map[i] == 0)
				continue;
			
			ans += map[i];
			type--;
			if (type == 0)
				break;
		}
		
		System.out.println(ans);
	}
	
}