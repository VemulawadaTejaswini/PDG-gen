import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	    int n = sc.nextInt();
		
		String op="";
		char p;
		for(int i=0;i<s.length();i=i+n){
			p=s.charAt(i);
			op=op+p;
		}
		System.out.print(op);
	}
}