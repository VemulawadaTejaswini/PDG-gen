
import java.util.Scanner;

public class Main {
	public static boolean is(String s){
		char c[]=s.toCharArray();
		int n=c.length;
		for(int i=0;i<=n/2;i++){
			if(c[i]!=c[n-i-1]){
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println((is(s)&&is(s.substring(0,(s.length()-1)/2))&&is(s.substring((s.length()+1)/2))?"Yes":"No"));
	}
}
