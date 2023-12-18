import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String o = sc.next();
		String e = sc.next();
		int m = o.length();
		int n = e.length();
		for(int i=0; i<n; i++){
			System.out.print(o.charAt(i));
			System.out.print(e.charAt(i));
		}
		if(m>n)System.out.print(o.charAt(m-1));
		System.out.println("");
	}
}