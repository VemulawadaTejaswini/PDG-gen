import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n>0)System.out.println(360/n);
		else System.out.println("0");
	}

}