import java.math.*;
import java.util.*;
import static java.lang.System.*;

public class Main {
	//初期フィールド・メソッド---------------------------------------------
	static Scanner sc = new Scanner(System.in);
	static int min(int... ar) {Arrays.sort(ar); return ar[0];}
	static int max(int... ar) {Arrays.sort(ar); return ar[ar.length-1];}
	//------------------------------------------------------------


	//フィールド追加場所-----------------------------------------------
	//------------------------------------------------------------


	//メソッド追加場所------------------------------------------------
	//------------------------------------------------------------


	//mainメソッド---------------------------------------------------
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n==0 && m==0) break;
			
			LinkedList<Integer> list = new LinkedList<>();
			for (int i=1; i<=n-1; i++) list.add(i);
			list.addFirst(n);
			
			int j = 0;
			while (list.size() != 1) {
				for (int i=0; i<(j==0?m:m-1); i++) {
					list.addLast(list.removeFirst());
				}
				list.removeFirst();
				j++;
			}
			
			out.println(list.getFirst());
		}
	}
	//------------------------------------------------------------
}
