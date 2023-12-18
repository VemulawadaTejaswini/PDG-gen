import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	long k = sca.nextLong();
	ArrayList<Long> list = new ArrayList<>();
	long[] ai = new long[n];
	for(int i = 0; i < n; i++) {
		ai[i] = sca.nextLong();
	}

	for(int i = 0; i < n; i++) {
		for(int j = i+1; j < n; j++) {
			list.add(ai[i]*ai[j]);
		}
	}
	Collections.sort(list);
	System.out.println(list.get((int)k-1));

	// 後始末
	sca.close();
	}
}