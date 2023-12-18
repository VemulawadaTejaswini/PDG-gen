package sd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String arr=in.next();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i <arr.length(); i++) {
			if(map.get(arr.charAt(i))==null){
				map.put(arr.charAt(i), 1);
			}else{
				map.put(arr.charAt(i), map.get(arr.charAt(i)+1));
			}
		}
		if(map.size()==2){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
