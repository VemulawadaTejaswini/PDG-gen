import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int a = A-1; //等差
		int x = 0;
		while(a*x +1 < B) {
			x++;
		}
		
		System.out.println(x);
		
		sc.close();	
	}
}