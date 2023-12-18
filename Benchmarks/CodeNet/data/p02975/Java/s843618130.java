import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numN = s.nextInt();
		long[]nums = new long[numN];
		for(int i = 0; i < numN ; i++) {
			nums[i] = s.nextInt();
		}
		String judge = "Yes";
		for(int i = 1; i < numN -1; i++) {
			long numA = nums[i-1];
			long numB = nums[i+1];
			long judgeAB = numA^numB;
			if(judgeAB != nums[i]) {
				judge = "No";
			}
		}
		System.out.println(judge);

	}

}
