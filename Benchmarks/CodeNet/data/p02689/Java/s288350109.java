import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] heightInfo = new int[n];
		for(int i =0;i < n;i++) {
			heightInfo[i] = sc.nextInt();
		}
		int[] badInfo = new int[n];
		for(int i =0;i <m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(heightInfo[a-1] < heightInfo[b-1]) {
				badInfo[a-1]++;
			}
			if(heightInfo[a-1] > heightInfo[b-1]) {
				badInfo[b-1]++;
			}

			if(heightInfo[a-1] == heightInfo[b-1]) {
				badInfo[a-1]++;
				badInfo[b-1]++;
			}

		}
		int jogai = 0;
		for(int i = 0;i < n;i++) {
			if(badInfo[i] >0) {
				jogai++;
			}
		}

		System.out.println(n -jogai);
	}
}