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
		int[][] keiroInfo = new int[m][2];
		for(int i =0;i <m;i++) {
			keiroInfo[i][0] = sc.nextInt();
			keiroInfo[i][1] = sc.nextInt();
		}
		int answer = 0;
		for(int i =0;i < n;i++) {
			int height = heightInfo[i];
			for(int j =0;j <m;j++) {
				int a = keiroInfo[j][0];
				int b = keiroInfo[j][1];
				if(i +1 == a) {
					if(height <= heightInfo[b-1]) {
						break;
					}
				}
				if(i +1 == b) {
					if(height <= heightInfo[a-1]) {
						break;
					}
				}
				if(j == m-1) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}