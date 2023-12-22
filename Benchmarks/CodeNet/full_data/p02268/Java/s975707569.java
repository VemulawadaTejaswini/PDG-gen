

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a1 = new int[n];
		for (int i = 0; i < n; ++i)
			a1[i] = scan.nextInt();
		//System.out.println(Arrays.toString(a1));
		//System.out.println(Arrays.binarySearch(a1, 1));
		int q = scan.nextInt();
		int t;
		int sum = 0;
		for (int i = 0; i < q; ++i) {
			t = scan.nextInt();
			if (Arrays.binarySearch(a1, t) >= 0) {//如果找不到则返回应该插入位置的负数值（逻辑索引，实际-1）
				//System.out.println("t:" + t);
				//System.out.println(Arrays.binarySearch(a1, t));
				sum++;
			}
		}
		System.out.println(sum);
		
//		int[] a2 = new int[10];
//		for (int i = 0; i < a2.length; i++) {
//			a2[a2.length - 1 - i] = i;
//		}
//		System.out.println(Arrays.binarySearch(a2, 4));
	}
}

