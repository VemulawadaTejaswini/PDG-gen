import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		// 入力
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] xList = new int[n];

		for (int i = 0; i < n; i++) {
			xList[i] = scanner.nextInt();
		}
		
		
		for (int i = 0; i < xList.length; i++) {
			int[] copyList = new int[n-1];
			for (int j = 0; j < xList.length-1; j++) {
				if(i <= j) {
					copyList[j] = xList[j+1];
				} else {
					copyList[j] = xList[j];
				}
			}
			Arrays.sort(copyList);
			int point = n/2 -1;
			int target = copyList[point];
			System.out.println(target);
		}

	}

}