import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class Main {
	static Scanner InData = new Scanner(System.in);
	static TreeSet<Integer> S = new TreeSet<Integer>();
	static int qType, qVal, qVal2;
	
	public static void main(String[] args) {
		getQuery();
	}

	private static void getQuery() {
		int qNum = InData.nextInt();
		
		for(int indexOfQuery = 0; indexOfQuery < qNum; indexOfQuery++) {
			qType = InData.nextInt();
			qVal = InData.nextInt();
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
			break;
		case 3:
			qVal2 = InData.nextInt();
			SortedSet<Integer> subSet = S.subSet(val, qVal2 + 1);
			for(int idxOfOut : subSet) {
				System.out.println(idxOfOut);
			}
			break;
		}
	}
}
