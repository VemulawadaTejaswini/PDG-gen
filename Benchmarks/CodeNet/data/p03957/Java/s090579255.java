package a;

import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String x =sc.nextLine();
		
		char[] a = x.toCharArray();
		
		int p = 0, q = 0;
		
		for (int i = 0; i < a.length; i++){
			if (a[i] == 'C'){
				p = i;
			}
			if (a[i] == 'F'){
				q = i;
			}
		}
		
		if (p < q){
			System.out.println("YES");
		}
		if (p > q){
			System.out.println("NO");
		}
		
		sc.close();
	}
}
