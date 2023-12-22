import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.printf("%d %d %.5f", a/b, a%b, (double)a/b); 
	}
}