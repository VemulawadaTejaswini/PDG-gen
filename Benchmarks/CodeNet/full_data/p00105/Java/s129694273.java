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
		Map<String,List<Integer>> map = new TreeMap<>();
		
		while (sc.hasNext()) {
			String word = sc.next();
			int page = sc.nextInt();
			
			if (!map.containsKey(word)) map.put(word, new ArrayList<>());
			map.get(word).add(page);
		}
		
		map.forEach((k,v)-> {
			out.println(k);
			for (int i=0; i<v.size(); i++) {
				out.print((i==0?"":" ")+v.get(i));
			}
			out.println();
		});
	}
	//------------------------------------------------------------
}
