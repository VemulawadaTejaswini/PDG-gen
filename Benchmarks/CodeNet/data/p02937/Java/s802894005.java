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
		ArrayList<ArrayList<Integer>> alphabet = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < 26; i++){
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    alphabet.add(list);
		}
		for(int i = 0; i < s.length(); i++){
	        ArrayList<Integer> list = alphabet.get(s.charAt(i) - 'a');
	        list.add(i);
		}
		//System.out.println(alphabet.toString());
		for(int i = 0; i < t.length(); i++){
		    ArrayList<Integer> list = alphabet.get(t.charAt(i) - 'a');
		    if(list.isEmpty()){
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
