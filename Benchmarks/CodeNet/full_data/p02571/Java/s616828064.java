
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static int funct(String s,String t) {
		int n=s.length();
		int m=t.length();
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<n-m+1;i++) {
			int min=0;
			for(int j=0;j<m;j++) {
				if(t.charAt(j)!=s.charAt(i+j)) {
					min++;
				}
			}
			ans=Math.min(min, ans);
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		System.out.println(funct(s,t));
	}

}
