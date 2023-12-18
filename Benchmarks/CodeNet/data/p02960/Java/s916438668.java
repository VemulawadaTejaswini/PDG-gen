
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		s.toCharArray();
		
		long number = 0;
		int keta = s.length();
		
		
		ArrayList<Integer> ks = new ArrayList<>();
		
		//まずは初期でNONはてなのやつを格納しておく
		for (int k = 0; k < keta ; k ++) {
			if (s.charAt(k) != '?') {		
				ks.add(k);
			}
		};
		int hatena = s.length() -ks.size();
		String st = "";
		long count = 0;
		for (int i = 0 ; i < Math.pow(10, hatena) ; i ++) {
			
			//000001 みたく強制的に文字列にする。
			
			st = new String(i+"");
			if (st.length() < hatena) {
				while (st.length() < hatena) {	
					st = "0" + st;
				}
			}
			StringBuilder sb = new StringBuilder(st);
			for (int j : ks) {	
				sb = sb.insert(j, ""+s.charAt(j));
			}
			if ( Integer.valueOf(new String(sb))% 13 ==5) {		
				count ++;
			}
		}
		System.out.println(count%(10000007));
	}
}
