import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int C = in.nextInt();
		int[] time = new int[100001];
		for(int i=0;i<n;i++) {
			int s = in.nextInt();
			int t = in.nextInt();
			int c = in.nextInt();
			time[s]++;
			time[t+1]--;
		}
		for(int i=1;i<=100000;i++) {
			time[i] += time[i-1];
		}
		int max = 0;
		for(int i=1;i<=100000;i++) {
			max = Math.max(max, time[i]);
		}
		System.out.println(max);
		in.close();

	}

}
