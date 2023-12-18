import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
String s =sc.next();
String t=sc.next();
int a=sc.nextInt();
int b =sc.nextInt();
String u =sc.next();
if(u.equals(s)){
	a=a-1;
	}
if(u.equals(t)){
b=b-1;
}
System.out.print(a+" ");
System.out.println(b);
	}
}