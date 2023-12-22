
//import java.lang.Math;
import java.util.*;
//import java.util.ListIterator;
//import java.util.Iterator;
//import java.util.LinkedList;

class Main{

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] demo = new int[n];
		for (int i = 0; i < n; i++) {
			demo[i] = sc.nextInt();

		}

		int m = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int cnt =0;
			int key=sc.nextInt();
			for(int j=a;j<b;j++){
				
				if(key==demo[j]) cnt++;
				
			}
			System.out.println(cnt);

		}

	}
}
