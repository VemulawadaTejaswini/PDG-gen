import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String b="+";
		while(!b.equals("?")){
			int a=sc.nextInt();
			b=sc.next();
			int c=sc.nextInt();
			if(b.equals("+"))System.out.printf("%d\n",a+c);
			if(b.equals("-"))System.out.printf("%d\n",a-c);
			if(b.equals("*"))System.out.printf("%d\n",a*c);
			if(b.equals("/"))System.out.printf("%d\n",a/c);
		}
	}
}