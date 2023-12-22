import java.util.Scanner;

public class a{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a / 3600;
		int c = a % 3600;
		int d = c / 60;
		int e = c % 60;
		System.out.println(b+":"+d+":"+e);
		 }
	 } 