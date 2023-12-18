package atCoder.abc165.e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Set<Integer> set = new HashSet<>();
		for( int i=0; i<m ; i++ ) {
			int l = i+1;
			int r = n-i;
			
			if( l==r || set.contains(l) || set.contains(r) ) {
				n--;r--;
			}

			set.add(l);
			set.add(r);
			
			System.out.println( l + " " + r );
		}
	}

}
