

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine().trim();
	String t=br.readLine().trim();
	algo(s,t);	
	
	}

	public static void algo(String s,String t) {
		int res=0;
		for(int i=0;i<s.length();i++) {
			char c1=s.charAt(i);
			char c2=t.charAt(i);
			if(c1!=c2) {
				res++;
			}
		}
		System.out.println(res);
		
		
	}
	
	
	
}
