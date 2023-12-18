import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int targetNumber = n/2 - 1;
		List<Integer> numberList = new ArrayList<>();
		for(int i=0;i<n;i++) {
			numberList.add(sc.nextInt());
		}
		sc.close();
		int out = 0;
		for(int i=0;i<n;i++) {
			List<Integer> targetList = new ArrayList<>();
			for(int i2=0;i2<n;i2++) {
				if(i2 == out) continue;
				targetList.add(numberList.get(i2));
			}
			Collections.sort(targetList, Collections.reverseOrder());
	        System.out.println(targetList.get(targetNumber));
	        out++;
		}
	}
}