import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nn = sc.nextInt();
		int nnn = sc.nextInt();
		if((n+nn+nnn)>=22) System.out.println("bust");
		else	System.out.println("win");
	}
}