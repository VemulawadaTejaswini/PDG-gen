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

		// ペナルティ数
		int collectNum = 0;
		int penaNum = 0;
		ArrayList<Integer> alreadyChecked = new ArrayList<Integer>();
		for(Result result: results) {
			boolean isSet = alreadyChecked.contains(result.probNum);
			if(result.result.equals("WA") && !isSet) {
				penaNum++;
			}

			if(result.result.contentEquals("AC") && !isSet) {
				alreadyChecked.add(result.probNum);
				collectNum ++;
			}

			if(alreadyChecked.size() == n) {
				break;
			}
		}

		for(int a: alreadyChecked) {
			System.out.println(a);
		}

		System.out.println(collectNum + " " + penaNum);

	}

}