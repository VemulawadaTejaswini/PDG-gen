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
		HashMap<Character, ArrayList<Integer>> alphabet = new HashMap<Character, ArrayList<Integer>>();
		for(int i = 0; i < s.length(); i++){
		    if(alphabet.containsKey(s.charAt(i))){
		        ArrayList<Integer> list = alphabet.get(s.charAt(i));
		        list.add(i);
		        alphabet.put(s.charAt(i), list);
		    }else{
		        ArrayList<Integer> list = new ArrayList<Integer>();
		        list.add(i);
		        alphabet.put(s.charAt(i), list);
		    }
		}
		//System.out.println(alphabet.toString());
		for(int i = 0; i < t.length(); i++){
		    ArrayList<Integer> list = alphabet.get(t.charAt(i));
		    if(list == null || list.isEmpty()){
		        result = -1;
		        break;
		    }
		    int first = t.length() + 1;
		    for(Integer j : list){
		        first = min(first, j);
		        if(currentIndex < j){
		            currentIndex = j;
		            first = t.length() + 1;
		            break;
		        }
		    }
		    if(first < t.length() + 1){
		        loop++;
		        currentIndex = first;
		    }
		}
		//System.out.println(loop);
		//System.out.println(currentIndex);
		if(result != -1) result = loop * s.length() + currentIndex + 1;
		
		// 出力
		System.out.println(result);
		
	}
}
