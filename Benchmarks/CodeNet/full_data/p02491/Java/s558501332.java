import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result_a = (a / b);
		int result_b = (a % b);
		
		double c = a;
		double d = b;
		
		double result_c = (c / d);
		
		System.out.println(result_a);
		System.out.println(result_b);
		System.out.println(result_c);
	}
}