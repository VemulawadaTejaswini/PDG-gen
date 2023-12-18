import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long n=s.length();
		long[]alph=new long[26];
		
		for(int i=0;i<n;i++) {
			alph[s.charAt(i)-'a']++;
		}
		
		long ans=n*(n-1)/2+1;
		for(int k=0;k<26;k++) {
			if(alph[k]>1) {
				ans-=alph[k]*(alph[k]-1)/2;
			}
		}
		System.out.println(ans);
	}
}