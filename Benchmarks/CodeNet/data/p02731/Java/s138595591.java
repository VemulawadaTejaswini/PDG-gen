import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		int val = (int)Math.ceil(n/3);
		long val1 = (val*val*val);
		String s=""+val1;
		s+=".000000000000";
		System.out.println(s);
		

	}

}