import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a1=scan.nextInt();
		int a2=scan.nextInt();
		int a3=scan.nextInt();
		System.out.println(Math.max(a1, Math.max(a2, a3))-Math.min(a1, Math.max(a2, a3)));

	}

}