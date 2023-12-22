import java.util.*;


public class Main {
	static Scanner InData = new Scanner(System.in);
	static int qType, qVal;
	static String qKey;
	static Map<String, Integer> M = new HashMap<String, Integer>();
	public static void main(String[] args) {
		getQuery();
	}
	private static void getQuery() {
		int qNum = InData.nextInt();
		for(int indexOfQuery = 0; indexOfQuery < qNum; indexOfQuery++) {
			qType = InData.nextInt();
			qKey = InData.next();
			doQuery(qType, qKey);
		}
	}
	private static void doQuery(int type, String key) {
		switch(type) {
		case 0:
			qVal = InData.nextInt();
				M.put(key, qVal);
			break;
		case 1:
			System.out.println(M.get(key));
			break;
		}
	}
}

