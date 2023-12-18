import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int s = sc.nextInt();
		int nextVal = 0;
		boolean isExist = false;

		ArrayList<Integer> aryList = new ArrayList<Integer>();
		aryList.add(s);

		while(!isExist){
			nextVal = calc(s);

			aryList.add(nextVal);

			if(aryList.contains(nextVal)){
				isExist = true;
			}

			s = nextVal;
		}

		System.out.println(nextVal);

		sc.close();
	}

	private static int calc(int target){
		int ret = 0;

		if(target%2 == 0){
			ret = target / 2;
		}else{
			ret = 3 * target / + 1;
		}

		return ret;
	}
}