import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int[] scount = new int[26];
		int[] tcount = new int[26];
		for(int i=0;i<s.length();i++){
			scount[(int)s.charAt(i)-(int)'a']++;
		}
		for(int i=0;i<t.length();i++){
			tcount[(int)t.charAt(i)-(int)'a']++;
		}
		int counter = 0;
		for(int i=0;i<26;i++){
			counter += Math.min(scount[i],tcount[i]);
		}
		if(((int)Math.max(s.length(),t.length())+1)/2<=counter){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	} 
}
