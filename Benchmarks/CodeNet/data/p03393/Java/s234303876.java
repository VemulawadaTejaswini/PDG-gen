import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.equals("zyxwvutsrqponmlkjihgfedcba")) {
			System.out.println(-1);
			return;
		}
		char[] c = new char[s.length()];
		boolean[] alp=new boolean[26];
		for (int i = 0; i < s.length(); i++) {
		    c[i]=s.charAt(i);
		    alp[(int)c[i]-97]=true;
		}
		String ans="";
		if(s.length()<26) {
			for(int i=0;i<26;i++) {
				if(!alp[i]) {
					ans=ans+s+(char)(i+97);
					System.out.println(ans);
					return;
				}
			}
		}else {
			char last=c[25];
			for(int i=24;i>=0;i--) {
				if((int)last>(int)c[i]) {
					for(int j=0;j<i;j++) {
						ans=ans+c[j];
					}
					ans=ans+last;
					System.out.println(ans);
					return;
				}
			}
		}

	}

}
