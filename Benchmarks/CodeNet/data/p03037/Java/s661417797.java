 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in) ;
		int n = scan.nextInt();
		int m = scan.nextInt();
		ArrayList<Integer> L = new ArrayList<>();
		ArrayList<Integer> R = new ArrayList<>();
		for(int i = 0 ; i<m ; i++) {
			L.add(scan.nextInt());
			R.add(scan.nextInt());
		}
	    int a = Collections.max(L) ;
	    int b = Collections.min(R) ;
		int result = (b-a) +1 ;
		if(result > 0) {
			System.out.println(result);
		}else {
			System.out.println(0);
		}
	}
}
