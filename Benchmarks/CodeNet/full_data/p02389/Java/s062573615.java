import.java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.next();
		int b = in.next();
		int sum = (a+b)*2;
		
		System.out.println(a*b+" "+sum);
	}
}