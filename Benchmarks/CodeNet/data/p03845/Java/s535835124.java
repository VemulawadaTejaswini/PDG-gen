import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] timeInfo = new int[n +1];
		for(int i =1;i <= n;i++) {
			timeInfo[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		for(int i = 0;i < m;i++) {
			int[] timeInfod = timeInfo.clone();
			timeInfod[sc.nextInt()] = sc.nextInt();
			int totalTime = 0;
			for(int time :timeInfod) {
				totalTime += time;
			}
			System.out.println(totalTime);
		}
	}
}