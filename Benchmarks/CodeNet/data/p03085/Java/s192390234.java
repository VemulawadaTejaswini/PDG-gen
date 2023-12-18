import java.util.*;
public class Main{
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	if(a.charAt(0)=='A')
	System.out.println("T");
    if(a.charAt(0)=='T')
		System.out.println("A");
	if(a.charAt(0)=='C')
		System.out.println("G");
	if(a.charAt(0)=='G')
		System.out.println("C");
	}
}