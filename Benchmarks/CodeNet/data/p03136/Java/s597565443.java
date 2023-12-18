import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		Integer max = Collections.max(list);
		int sum = 0;
		for(int i=0; i<n; i++) {
			if(list.get(i) == max) {
				continue;
			}else {
				sum += list.get(i);
			}
		}
		if(sum>max) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
