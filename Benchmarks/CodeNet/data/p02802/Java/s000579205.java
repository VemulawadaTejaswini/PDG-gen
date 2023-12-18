import java.util.ArrayList;
import java.util.Scanner;

class Result {
	public int probNum;
	public String result;

	public Result(int probNum, String result) {
		this.probNum = probNum;
		this.result = result;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		ArrayList<Result> results = new ArrayList<Result>();
		for(int i=0; i<m; ++i)  {
			Result result = new Result(scan.nextInt(), scan.next());
			results.add(result);
		}
		scan.close();
//		// 正解数
//		int collectNum = 0;
//		for(Result result: results) {
//			if(result.result.contentEquals("AC")) {
//				collectNum ++;
//			}
//		}

		// ペナルティ数
		int collectNum = 0;
		int penaNum = 0;
		int checkingProbNum = 1;
		for(Result result: results) {
			if(result.result.equals("WA") && checkingProbNum == result.probNum) {
				penaNum++;
			}
			if(result.result.contentEquals("AC")) {
				checkingProbNum++;
				collectNum ++;
			}
		}

		System.out.println(collectNum + " " + penaNum);

	}

}
