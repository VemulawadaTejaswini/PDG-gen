import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[2][10];
		for(int i=0;i<2;i++) {
			for(int j=0;j<10;j++) {
				score[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			Arrays.sort(score[i]);
			int ans = 0;
			for(int j=9;j>=7;j--) {
				ans+=score[i][j];
			}
			if (i==0) {
				System.out.print(ans + " ");
			}else{
				System.out.println(ans);
			}
		}
	}

}