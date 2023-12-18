import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		
		String st1 = s1.substring(0,1).toUpperCase();
		String st2 = s2.substring(0,1).toUpperCase();
		String st3 = s3.substring(0,1).toUpperCase();
		
		System.out.println(st1 + st2 + st3);
	}
}