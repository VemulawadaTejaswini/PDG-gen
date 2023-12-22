import java.util.HashSet;
import java.util.Scanner;


public class Main {
	static Scanner InData = new Scanner(System.in);
	static HashSet<Integer> S = new HashSet<Integer>();
	
	public static void main(String[] args) {
		getQuery();
	}

	private static void getQuery() {
		int qNum = InData.nextInt();
		int qType, qVal;
		for(int indexOfQuery = 0; indexOfQuery < qNum; indexOfQuery++) {
			qType = InData.nextInt();
			qVal = InData.nextInt();;
			doQuery(qType, qVal);
		}
	}

	private static void doQuery(int type, int val) {
		switch(type) {
		case 0:
			S.add(val);
			System.out.println(S.size());
			break;
		case 1:
			System.out.println(S.contains(val) ? 1 : 0);
			break;
		case 2:
			S.remove(val);
		}
	}
}
