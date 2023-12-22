

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
//	private int LinearSearch(int[] a1, int[] a2) {
//		
//	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Set<Integer> set1 = new HashSet<>();
		for (int i = 0; i < n; ++i) 
			set1.add(scan.nextInt());
		int q = scan.nextInt();
		Set<Integer> set2 = new HashSet<>();
		for (int i = 0; i < q; ++i) 
			set2.add(scan.nextInt());
//		set1.retainAll(set2);//求共同元素
//		//返回值表示set1的内存发生改变，s两者可能没有公共元素，set1变成空集
//		System.out.println(set1.size());
		int sum = 0;
		for(int i : set1)
			for (int j : set2) {
				if(i == j)
					sum++;
			}
		System.out.println(sum);
				
	}

}

