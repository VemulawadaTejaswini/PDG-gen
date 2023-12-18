
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int l=scn.nextInt();
		int x=(n*(n+1))/2-1;
		l--;
		n--;
		x+=l*n;
		System.out.println(x);
	}

}
