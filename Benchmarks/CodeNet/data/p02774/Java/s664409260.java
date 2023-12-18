import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
		int n = sc.nextInt();
		int k = sc.nextInt();

		List<Integer> numList = new ArrayList<>();
		List<Long> ansList = new ArrayList<>();

		for(int i=0;i<n;i++) {
			numList.add(sc.nextInt());
		}

		for(int i=0;i<n;i++) {
			long a1 = numList.get(i);
			for(int j=0;j<n-i-1;j++) {
				long a2 = numList.get(i+j+1);
				ansList.add(a1*a2);
			}
		}

		Collections.sort(ansList);

		System.out.println(ansList.get(k-1));

	}
}
