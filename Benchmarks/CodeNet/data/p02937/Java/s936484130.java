import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		String t = sc.next();
		
		// 計算
		long result = 0;
		int currentIndex = -1;
		long loop = 0;
		ArrayList<TreeSet<Integer>> alphabet = new ArrayList<TreeSet<Integer>>();
		for(int i = 0; i < 26; i++){
		    TreeSet<Integer> list = new TreeSet<Integer>();
		    alphabet.add(list);
		}
		for(int i = 0; i < s.length(); i++){
	        TreeSet<Integer> list = alphabet.get(s.charAt(i) - 'a');
	        list.add(i);
		}
		//System.out.println(alphabet.toString());
		for(int i = 0; i < t.length(); i++){
		    TreeSet<Integer> list = alphabet.get(t.charAt(i) - 'a');
		    if(list.isEmpty()){
		        result = -1;
		        break;
		    }
		    Integer index = list.higher(currentIndex);
		    if(index == null){
		        loop++;
		        currentIndex = list.first();
		    }else{
		        currentIndex = index;
		    }
		}
		//System.out.println(loop);
		//System.out.println(currentIndex);
		if(result != -1) result = loop * s.length() + currentIndex + 1;
		
		// 出力
		System.out.println(result);
		
	}
}
