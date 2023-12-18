import java.util.*;
import java.math.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//int N=sc.nextInt();
		String s=sc.nextLine();
		
		//System.out.println(s.charAt(2));
		int a= Character.getNumericValue(s.charAt(0));
		int b= Character.getNumericValue(s.charAt(4));
		
		if(s.charAt(2)=='+') {
			System.out.println(a+b);
		}else {
			System.out.println(a-b);
		}
	}

}