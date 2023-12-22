import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arrayCnt = new Integer(s.nextLine()).intValue();
		int[] array = new int[arrayCnt];
		String[] tmpArray = s.nextLine().split(" ");
		for(int i=0 ; i<array.length ; i++) {
			array[i] = new Integer(tmpArray[i]).intValue();
		}

		int targetCnt = new Integer(s.nextLine()).intValue();
		int[] target = new int[targetCnt];
		String[] tmpTarget = s.nextLine().split(" ");
		for(int i=0 ; i<target.length ; i++) {
			int sum = 0;
			int cnt = -1;

			target[i] = new Integer(tmpTarget[i]).intValue();
			if(search(cnt, sum, array, target[i], arrayCnt))
				System.out.println("yes");
			else
				System.out.println("no");
		}


	}

	public static boolean search(int cnt, int sum, int[] array, int target, int stopCnt) {
		cnt++;
		if(sum == target)
			return true;
		else if(cnt == stopCnt) {
			return false;
		}

		boolean a = search(cnt, sum+array[cnt], array, target, stopCnt);
		boolean b = search(cnt, sum, array, target, stopCnt);
		if(a == true || b == true)
			return true;
		else
			return false;
	}
}