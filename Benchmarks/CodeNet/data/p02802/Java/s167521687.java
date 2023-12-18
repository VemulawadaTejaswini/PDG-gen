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
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());
		ArrayList<Result> results = new ArrayList<Result>();
		boolean hasCollect = false;
		for(int i=0; i<m; ++i)  {
			Result result = new Result(Integer.parseInt(scan.next()), scan.next());
			if(result.result.equals("AC")) {
				hasCollect = true;
			}
			results.add(result);
		}
		scan.close();

		int collectNum = 0;
		int penaNum = 0;

		if(hasCollect == true) {
			ArrayList<Integer> collected = new ArrayList<Integer>();
			for(Result result: results) {
				boolean isSet = collected.contains(result.probNum);
				if(result.result.equals("AC") && !isSet) {
					collected.add(result.probNum);
					++collectNum;
				}
				if(collected.size() == n) {
					break;
				}
			}

			ArrayList<Integer> alreadyCollected = new ArrayList<Integer>();
			for(Result result: results) {
				boolean isSet = collected.contains(result.probNum);
				boolean alredySet = alreadyCollected.contains(result.probNum);
				if(result.result.equals("WA") && isSet && !alredySet) {
					++penaNum;
				} else if (result.result.equals("AC") && !alredySet) {
					alreadyCollected.add(result.probNum);
				}
				if(alreadyCollected.size() == n) {
					break;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(collectNum);
		sb.append(" ");
		sb.append(penaNum);

		System.out.println(sb);

	}

}