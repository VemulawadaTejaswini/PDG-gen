import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxScore = 0;
		int[] scoreList= new int[n];
		for(int i =0;i < n;i++) {
			int score = sc.nextInt();
			maxScore += score;
			scoreList[i] = score;
		}
		Arrays.sort(scoreList);
		for(int i =0;i <n;i++) {
			if(maxScore %10 !=0) {
				System.out.println(maxScore);
				return;
			}else {
				maxScore -= scoreList[i];
			}
		}
		System.out.println(0);

	}

}