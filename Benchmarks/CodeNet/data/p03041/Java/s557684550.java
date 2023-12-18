//package atcoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s=sc.next();
		System.out.println(s.substring(0,k-1) + (char)(s.charAt(k-1)+32) + s.substring(k));

	}

}
