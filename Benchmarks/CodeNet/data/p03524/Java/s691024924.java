import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			String S = scan.next();
			char[]s = S.toCharArray();
			Map<Character,Integer>map = new TreeMap<Character,Integer>();

			for(int i = 0;i<s.length;i++) {
				if(map.containsKey(s[i]))map.put(s[i], map.get(s[i])+1);
				else map.put(s[i], 1);
			}


			if(map.size()==1) {
				if(s.length==1) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else if(map.size()==2) {
				int[]x = new int[2];
				int i = 0;
				for(Character c:map.keySet()) {
					x[i] = map.get(c);
					i++;
				}

				if(x[0]==x[1]) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else{

				int goukei = 0;
				int max = 0;
				for(Character c:map.keySet()) {
					int a = map.get(c);
					max = Math.max(a, max);
					goukei+=a;
				}

				goukei-=max;
				//System.out.println(goukei);
				if(goukei<max-1) {
					System.out.println("NO");
				}else {
					System.out.println("YES");
				}


			}





		}


	}


}
