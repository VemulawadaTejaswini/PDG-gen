import java.util.Scanner;
		
public class Main {
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int a;
		a= sc.nextInt();
		int b;
		b= sc.nextInt();
		System.out.println(a * b + " " + 2 * ( a + b));
	}
}