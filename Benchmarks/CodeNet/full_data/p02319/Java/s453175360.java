import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long W = scn.nextLong();
		long[] weight = new long[100*100+1];
		for(int i = 0;i <= 100*100;i++) {
			weight[i] = Long.MAX_VALUE;
		}
		weight[0] = 0;
		for(int i = 0;i < N;i++) {
			int v = scn.nextInt();
			long w = scn.nextLong();
			for(int j = 10000;j >= v ;j--) {
				if(weight[j-v]!=Long.MAX_VALUE)weight[j] = Math.min(weight[j], weight[j-v] + w);
			}
		}

		for(int i = 10000;i>=0;i--) {
			if(weight[i] <= W) {
				System.out.println(i);
				break;
			}
		}
		scn.close();
	}
}

