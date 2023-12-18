import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		List<Integer> numsList1 = numsInit(); 
		List<Integer> numsList2 = numsInit();
		List<Integer> multiple = new ArrayList<>();
		
		int loopCnt = 0;
		
		for (Integer num : numsList1) {
			multiple.add(num * numsList2.get(loopCnt));
			loopCnt++;
		}

		int num = Integer.parseInt(N);

		if (num <= 81) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	private static List<Integer> numsInit() {
		List<Integer> numsList = new ArrayList<>();
		numsList.add(1);
		numsList.add(2);
		numsList.add(3);
		numsList.add(4);
		numsList.add(5);
		numsList.add(6);
		numsList.add(7);
		numsList.add(8);
		numsList.add(9);
		return numsList;
	}
}