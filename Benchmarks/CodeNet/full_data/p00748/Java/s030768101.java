import java.util.*;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list1 = new int[180];
		int[] dp1 = new int[1000000];
		int[] dp2 = new int[1000000]; 
		for(int i = 0; i < 180; i++) {
			list1[i] = (i+1)*(i+2)*(i+3)/6;
		}

		Arrays.fill(dp1, 2 << 27);
		Arrays.fill(dp2, 2 << 27);

		dp1[0] = dp2[0] =  0;

		for(int i = 0; i < 180; i++) {
			int tmp = list1[i];
			if(list1[i] % 2 == 0)
			for(int j = tmp; j < 1000000; j++) {
				dp1[j] = Math.min(dp1[j-tmp]+1, dp1[j]);
			}
			else
			for(int j = tmp; j < 1000000; j++) {
				dp1[j] = Math.min(dp1[j-tmp]+1, dp1[j]);
				dp2[j] = Math.min(dp2[j-tmp]+1, dp2[j]);
			}
		}
		while(true) {
			int a = sc.nextInt();
			if(a == 0) break;
			System.out.println(dp1[a] + " " + dp2[a]);
		}
	}
	

	
}