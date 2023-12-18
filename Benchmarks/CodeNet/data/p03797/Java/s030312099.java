import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int n=sc.nextInt();
	private static int m=sc.nextInt();
	public static void main(String[] args){
		if(n>=2*m) System.out.println(n);
		else System.out.println((m-2*n)/4+n);
	}
}