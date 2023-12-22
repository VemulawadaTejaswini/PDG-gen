import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		if(a>b) System.out.println(a+">"+b);
		else if(a<b) System.out.println(a+"<"+b);
		else System.out.println(a+"=="+b);
	}
}