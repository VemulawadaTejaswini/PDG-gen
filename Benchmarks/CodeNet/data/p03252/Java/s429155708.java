import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();
			String T = scan.next();
			
			Map<Character,Integer>smap = new TreeMap<Character,Integer>();
			Map<Character,Integer>tmap = new TreeMap<Character,Integer>();
			
			for(int i = 0;i<S.length();i++) {
				char s = S.charAt(i);
				char t = T.charAt(i);
				if(smap.containsKey(s))smap.put(s, smap.get(s)+1);
				else smap.put(s, 1);
				if(tmap.containsKey(t))tmap.put(t, tmap.get(t)+1);
				else tmap.put(t, 1);
			}
			
			ArrayList<Entry<Character,Integer>> slist =
					new ArrayList<Entry<Character,Integer>>(smap.entrySet());
			
			ArrayList<Entry<Character,Integer>> tlist =
					new ArrayList<Entry<Character,Integer>>(tmap.entrySet());
			
			
			Comparator<Entry<Character,Integer>> CO = new COMP();
			
			Collections.sort(slist, CO);
			Collections.sort(tlist, CO);
			
			int[]sco = new int[smap.size()];
			int n = 0;
			for(Character key:smap.keySet()) {
				sco[n] = smap.get(key);
				
				//System.out.println(sco[n]);
				n++;
			}
			
			
			
			int s = 0;
			for(Integer v:tmap.values()) {
				//System.out.println(v);
				if(sco[s]!=v) {
					System.out.println("No");
					System.exit(0);
				}
				s++;
			}
			
			System.out.println("Yes");
			
			
			
			
			
			
			
		}
	}
		
		/*　　Comparator<ソートしたいクラス名> CO = new COMP();
		 * 
		 * 　static class COMP implements Comparator<クラス>{
		 *      　public int compare(クラス x,クラス y) {
		 *   　 return クラスの比較したいやつx。comperTo(クラスの比較したいやつ y) (x yの順序で昇順)
		 * 　}
		 * 
		 */
	
		static class COMP implements Comparator<Entry<Character,Integer>>{
		public int compare(Entry<Character,Integer> x,Entry<Character,Integer> y) {
			return x.getValue().compareTo(y.getValue());
		}
		
	}
		
		
	
		

}
