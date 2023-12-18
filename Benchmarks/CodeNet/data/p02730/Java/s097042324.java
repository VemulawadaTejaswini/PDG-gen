import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = s.length();
		int a = (n-1)/2;
		int b = (n+3)/2;
		int mida = a/2;
		int midb = (b+n)/2;
		
		if(s.substring(0,a).length()%2!=0){
		if(s.substring(0,mida).equals(s.substring(mida+1,a)) && s.substring(b-1,midb-1).equals(s.substring(midb,n))){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
		}
		else{
			if(s.substring(0,mida).equals(s.substring(mida,a)) && s.substring(b-1,midb).equals(s.substring(midb,n))){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
		}
	}
}