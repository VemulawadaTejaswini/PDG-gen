import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numN = s.nextInt();
		int[]nums = new int[numN];
		for(int i = 0; i < numN ; i++) {
			nums[i] = s.nextInt();
		}
		String judge = "Yes";
		for(int i = 1; i < numN -1; i++) {
			byte numA = (byte)nums[i-1];
			byte numB = (byte)nums[i+1];
			int judgeAB = numA^numB;
			if(judgeAB != nums[i]) {
				judge = "No";
			}
		}
		System.out.println(judge);

	}

}
