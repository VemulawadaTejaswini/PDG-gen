import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int a500 = 0;
		int a5 = 0;
		int u = 0;
		
		a500 = X/500;
		a5 = (X%500)/5;
		
		System.out.println(a500*1000+a5*5);
		
		sc.close();
	}
}