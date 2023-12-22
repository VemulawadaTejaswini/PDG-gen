

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		
		Map <Integer,Integer> hmb = new HashMap<Integer,Integer>();
		Map <Integer,Integer> hmc = new HashMap<Integer,Integer>();
		
		for(int i = 1 ; i <= n ;i++) {
			int a = Integer.parseInt(sc.next());
			int b = i + a;
			int c = i - a;
			if(hmb.containsKey(b)) {
				hmb.put(b, hmb.get(b) +1);
			}
			else {
				hmb.put(b,1);
			}
			if(hmc.containsKey(c)) {
				hmc.put(c, hmc.get(c) +1);
			}
			else {
				hmc.put(c,1);
			}
		}
		
		int ans = 0;
		
		for(int i = 0 ; i <= n ;i++) {
			if(hmb.containsKey(i)&&hmc.containsKey(i)) {
				int temp = hmb.get(i)* hmc.get(i);
				ans += temp;
			}
		}
		System.out.println(ans);
	
	}

}
