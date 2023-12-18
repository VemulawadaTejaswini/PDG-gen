import java.util.*;
import java.util.HashMap;

public class Main{
//public class abc164_c{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		String s = "";

		for(int i=0; i <n; i++){
			s = scan.next();
			if( ! hmap.containsKey(s)){
				hmap.put(s, 1);
			}

		}

		System.out.println(hmap.size());
	}

}