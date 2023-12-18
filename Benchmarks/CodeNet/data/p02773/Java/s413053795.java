import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	//static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	
	public static void main(String[] args) {
	int n =sc.nextInt();
	Map<String, Integer> map = new HashMap<String, Integer>(n);
	ArrayList<String> cc = new ArrayList<>(n);
	int max =0;
	String tmp;
	for(int i=0;i<n;i++) {
		tmp=sc.next();
		if(map.containsKey(tmp)) {
			map.put(tmp,map.get(tmp)+1);
		}else {
			map.put(tmp,1);		
			cc.add(tmp);
		}
		if(max<map.get(tmp)) {
			max=map.get(tmp);
		}
	
	}
	Collections.sort(cc);
	for(String a:cc) {
		if(map.get(a)==max) {
			p(a);
		}
	}
	
 }
}