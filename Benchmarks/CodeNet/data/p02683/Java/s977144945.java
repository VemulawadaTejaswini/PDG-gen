package atCoder2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer m = sc.nextInt();
		Integer x = sc.nextInt();
		
		Integer result = 0; //結果
		
		List<List<Integer>> bookLists = new ArrayList<List<Integer>>();
		for(int i = 0; i < n; i++) {
			List<Integer> propertyLists = new ArrayList<Integer>();
			for(int j = 0; j < m+1; j ++) {
				propertyLists.add(sc.nextInt());
			}
			bookLists.add(propertyLists);
		}
		
		//とりあえず、「-1」の判定
		for(int i = 0; i < m; i++) {
			Integer sum = 0;
			for(int j = 0; j < n; j++) {
				List<Integer> property = bookLists.get(j);
				Integer intA = property.get(i);
				sum  += intA;
			}
			if(sum < x) {
				result = -1;
				break;
			}
		}
		
		System.out.println(result);
	}
}