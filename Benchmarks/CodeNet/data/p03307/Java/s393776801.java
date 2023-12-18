import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int n=scan.nextInt();
		int s=0;
		if(n%2==0 ) {
			System.out.println(n);
		}
		else {
			System.out.println(2*n);
		}
	}