
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> numberList = new ArrayList();
		
		for(int i = 0; i < n; i++) {
			int number = sc.nextInt();
			numberList.add(number);
		}
		
		for(int i = 0; i < n; i++) {
			int tmp = numberList.get(i);
			numberList.remove(i);
			System.out.println(Collections.max(numberList));
			numberList.add(i, tmp);
		}
		

		
		

		
		
	}	

}

