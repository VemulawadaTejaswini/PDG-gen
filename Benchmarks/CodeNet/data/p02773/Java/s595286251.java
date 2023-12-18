import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Pair> pairs = new ArrayList<>();
		List<String> strings = new ArrayList<>();
		String[] S = new String[N];
		for(int i=0;i<N;i++) {
			S[i] = sc.next();
		}
		for(int i=0;i<N;i++) {
			//もしそれまでのペアに文字列を含むものがなければ新規追加、あれば回数を一つ増やして更新
			if(!pairsHasString(pairs,S[i])) {
				Pair pair = new Pair();
				pair.count=1;
				pair.str = S[i];
				pairs.add(pair);
			}else {
				Pair oldPair = pairs.remove(getPairIndexOfString(pairs,S[i]));
				oldPair.count+=1;
				pairs.add(oldPair);
			}
		}
		
		int maxCount = 0;
		for(Pair pair:pairs) {
			maxCount = Math.max(maxCount, pair.count);
		}
		for(Pair pair:pairs) {
			if(maxCount == pair.count) {
				strings.add(pair.str);
			}
		}
		
		strings.sort(new Comparator<String>() {
			public int compare(String str1,String str2) {
				return str1.compareTo(str2);
			}
		});
		
		for(String str:strings) {
			System.out.println(str);
		}
	}
	
	static int getPairIndexOfString(List<Pair> pairs,String string) {
		int index = 0;
		for(Pair pair:pairs) {
			if(pair.str.equals(string)) {
				return index;
			}else {
				index++;
			}
		}
		return index;
	}

	static boolean pairsHasString(List<Pair> pairs, String string) {
		for(Pair pair:pairs) {
			if(pair.str.equals(string)) {
				return true;
			}
		}
		return false;
	}
}
class Pair{
	int count;
	String str;
}