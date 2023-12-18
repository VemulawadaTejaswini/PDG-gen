import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int result = 0;
		for(int i = 0 ; i <= A ; i++) {
			
			for(int j = 0 ; j <= B ; i++) {
				
				for(int k = 0 ; k <= C ; i++) {
					
					if(X == (A*i + B*j + C*k)) {
						result++;
					}
					
				}
			}
			
		}
		System.out.println(result);
	}
}