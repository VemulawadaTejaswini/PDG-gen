import java.util.Arrays;
import java.util.Scanner;

public class Main{

	final int MAX_N = 1000002;
	int[] dp1 = new int[MAX_N], dp2 = new int[MAX_N];

	void run(){
		Scanner in = new Scanner(System.in);
		Arrays.fill(dp1, Integer.MAX_VALUE);
		Arrays.fill(dp2, Integer.MAX_VALUE);
		dp1[0] = dp2[0] = 0;
		for(int i=0; i<MAX_N; i++){
			for(int j=1, sum=1; i + sum < MAX_N; j++, sum += j*(j+1)/2){
				dp1[i+sum] = Math.min(dp1[i+sum], dp1[i]+1);
				if((sum&1)>0){
					dp2[i+sum] = Math.min(dp2[i+sum], dp2[i]+1);
				}
			}
		}
		for(int n = in.nextInt(); n > 0; n = in.nextInt()){
			System.out.println(dp1[n] + " " + dp2[n]);
		}
	}

	public static void main(String[] args){
		new Main().run();
	}
}