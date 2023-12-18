import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		
		System.out.println("" + (s1.charAt(0)+26) + (s2.charAt(0)+26) + (s3.charAt(0)+26));
	}
}