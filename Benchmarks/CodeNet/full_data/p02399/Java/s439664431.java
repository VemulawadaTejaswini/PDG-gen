import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double i=(double)a/(double)b;
 		System.out.printf((a-a%b)/b+" "+a%b+" "+"%.10f",i);
	}
}