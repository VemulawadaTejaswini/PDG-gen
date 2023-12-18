import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap <String,Integer> hm = new HashMap<String,Integer>();
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			char []c = sc.next().toCharArray();
			Arrays.sort(c);
			String s = String.valueOf(c);
			
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}
			else {
				hm.put(s,1);
			}	
		}
		
		long ans = 0;
		for(int a : hm.values()) {
			 ans += (long) a * (a -1) /2;
		}
		System.out.println(ans);
		
			
		

	}

}
