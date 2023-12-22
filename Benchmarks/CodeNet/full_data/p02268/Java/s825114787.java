import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arrayCnt = new Integer(s.nextLine()).intValue();
		String[] tmp = s.nextLine().split(" ");
		int[] targetArray = new int[arrayCnt];
		for(int i=0 ; i < arrayCnt ; i++) {
			targetArray[i] = new Integer(tmp[i]).intValue();
		}

		int cnt = new Integer(s.nextLine()).intValue();
		String[] aaa = s.nextLine().split(" ");
		int existCnt = 0;
		for(int i=0 ; i<aaa.length ; i++) {
			if(search(targetArray, new Integer(aaa[i]).intValue())) {
				existCnt++;
			}
		}
		System.out.println(existCnt);
	}

	public static boolean search(int[] targetArray, int aaa) {
		int start = 0;
		int end = targetArray.length-1;

		while(start <= end) {
			int mid = (start + end) / 2;
			if(targetArray[mid] == aaa)
				return true;
			else if(targetArray[mid] < aaa) {
				start = mid + 1;
			} else if(targetArray[mid] > aaa) {
				end = mid - 1;
			}
		}
		return false;
	}

}