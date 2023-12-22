

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		Integer[] num = new Integer[5];
		for(i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(num, Collections.reverseOrder());
		System.out.printf("%d %d %d %d %d\n",num[0], num[1], num[2], num[3], num[4]);
		sc.close();
	}


}

