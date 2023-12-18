import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Nを取得します
		int n = sc.nextInt();
		//diを取得します
		Set<Integer> d = new HashSet<Integer>();
		for (int i = 0 ; i < n ; i++ ) {
			int dIn = sc.nextInt();
			d.add(dIn);
		}
		
		
		/**
		 * SetをListに変えます
		 */
		
		List<Integer> dList = new ArrayList<Integer>();
	   
		for (Iterator<Integer> i = d.iterator() ; i.hasNext() ;) {
      		
			dList.add(i.next());
		
		}
		
		
		int ans = 0;
		for (int i = 1 ; i <= dList.size()  ; i++) {
			ans += combination(dList.size(),i);
		}
		
		/**
		 * 答えを出力します
		 */
			
		System.out.println(ans);
		
	}
		
		
		//コンビネーションを作ります
		public static int combination(int n , int r) {
			int nn = 1;
			int rr = 1;
			int nr = 1;
			int ncr;
			
			for (int i = 0 ; i < n ; i++) {
				nn *= (i+1);
			}
			for (int i = 0 ; i < r ; i++) {
				rr *= (i+1);
			}
			for (int i = 0 ; i < n - r ; i++) {
				nr *= (i+1);
			}
			
			ncr  = nn/(rr * nr);
			
			return ncr;
			
		}


}
