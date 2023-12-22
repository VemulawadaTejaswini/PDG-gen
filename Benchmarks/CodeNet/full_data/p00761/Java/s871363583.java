

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{ 
	
	private static int change(int a,int n) {
		
		int b = String.valueOf(a).length();
		String str = String.valueOf(a);
		
		while(str.length()<n)str+="0";

		char[] c = str.toCharArray();
		Arrays.sort(c);

		int max = 0;int min = 0;
		
		for(int i=0;i<str.length();i++) min = min*10+(c[i]-'0');
		for(int i=str.length()-1;i>=0;i--)max = max*10+(c[i]-'0');

		return max-min;
		
	}
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			while(sc.hasNext()) {
				int a = sc.nextInt();
				int n = sc.nextInt();
				if(a+n==0)break;
				
				
				int c = a;
				HashMap<Integer,Integer> hm = new HashMap<>();
				hm.put(a, 0);
				for(int i=1;;i++) {
					c = change(c,n);
					if(hm.containsKey(c)) {
						System.out.println((hm.get(c))+" "+c+" "+(i-hm.get(c)));
						break;
					}
					else
						hm.put(c, i);
					
				}
				
			}
		}
	}
}

