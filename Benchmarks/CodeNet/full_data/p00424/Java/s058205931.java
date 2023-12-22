import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0)break;
			HashMap<String,String> map = new HashMap<String,String>();
			char[] converse=new char[26+26+10];
			for(int i = 0;i<26;i++){
				converse[i]=(char)('a'+i);
			}
			for(int i = 26;i<52;i++){
				converse[i]=(char)('A'+i-26);
			}
			for(int i = 52;i<converse.length;i++){
				converse[i]=(char)('0'+i-52);
			}
			String ans="";
			for(int i =0;i<n;i++){
				int a,b;
				String s1 = cin.next();
				String s2 = cin.next();
				if(Character.isLowerCase(s1.charAt(0))){
					a=(s1.charAt(0)-'a');
				}
				else if(Character.isUpperCase(s1.charAt(0))){
					a=(s1.charAt(0)-'A'+26);
				}
				else{
					a=(s1.charAt(0)-'0'+52);
				}
			
				if(Character.isLowerCase(s2.charAt(0))){
					b=(s2.charAt(0)-'a');
				}
				else if(Character.isUpperCase(s2.charAt(0))){
					b=(s2.charAt(0)-'A');
				}
				else{
					b=(s2.charAt(0)-'0');
				}
				converse[a]=(char)s2.charAt(0);
			}
			int m = cin.nextInt();
			for(int i = 0;i<m;i++){
				int a;
				String s1 = cin.next();
				if(Character.isLowerCase(s1.charAt(0))){
					a=(s1.charAt(0)-'a');
				}
				else if(Character.isUpperCase(s1.charAt(0))){
					a=(s1.charAt(0)-'A'+26);
				}
				else{
					a=(s1.charAt(0)-'0'+52);
				}
				ans+=converse[a];
			}
			System.out.println(ans);
		}
	}
}