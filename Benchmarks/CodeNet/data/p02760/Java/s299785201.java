import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> valToPlace=  new HashMap<Integer, Integer>();
		boolean[] bingo = new boolean[10];
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				valToPlace.put(sc.nextInt(), i*3 + j + 1);
			}
		}
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int val = sc.nextInt();
			if (valToPlace.get(val) != null) {
				bingo[valToPlace.get(val)] = true;
			}
		}
		System.out.println(checkBingo(bingo));
		sc.close();
	}

	private static String checkBingo(boolean[] bingo) {
		boolean flag = false;
		if ((bingo[1] && bingo[5] && bingo[9]) 
				|| (bingo[1] && bingo[4] && bingo[7]) 
				|| (bingo[1] && bingo[2] && bingo[3]) 
				|| (bingo[2] && bingo[5] && bingo[8]) 
				|| (bingo[3] && bingo[5] && bingo[7]) 
				|| (bingo[3] && bingo[6] && bingo[9]) 
				|| (bingo[4] && bingo[5] && bingo[6]) 
				|| (bingo[7] && bingo[8] && bingo[9]) ) {
			flag = true;
		}
		return flag ? "Yes" : "No";
	}

}
