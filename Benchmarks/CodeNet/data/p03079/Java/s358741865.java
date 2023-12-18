import java.util.Scanner;

public class Main {
	
	public String judgeTriangle(int a, int b, int c){
		if(a < 1 || a > 100 || b < 1 || b > 100 || c < 1 || c > 100) return "No";
		if(a != c || b != c) return "No";
		
		if(a + b > c && a + c > b && b + c > a) return "Yes";
		else return "No";
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get integers
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
		
		System.out.println(equilateralTriangle.judgeTriangle(a, b, c));
	}
}
