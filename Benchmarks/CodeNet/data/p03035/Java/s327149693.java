import java.util.Scanner;

public class Main {
	//half and half


	public static void main(String[] args){
		int A,B;
		Scanner sc = new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		if(A>=13)System.out.println(B);
		else if(A>=6)System.out.println(B/2);
		else System.out.println(0);


	}
}