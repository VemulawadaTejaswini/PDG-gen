import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		int a,b,s,l;
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		s=a*b;
		l=2*(a+b);
		System.out.println(s+" "+l);
	}
}