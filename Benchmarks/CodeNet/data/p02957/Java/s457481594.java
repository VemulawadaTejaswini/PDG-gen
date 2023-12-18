import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long A = sc.nextInt(), B = sc.nextInt();
		if(A + B % 2 == 1) System.out.println("IMPOSSIBLE");
		else System.out.println((A + B ) / 2);
	}
}