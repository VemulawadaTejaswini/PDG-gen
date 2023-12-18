import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		
		
		int cheapest_price = A*X + Y*B;
		
		if(A+B<=2*C){
			System.out.println(cheapest_price);
		}
		else{
			for (int i = 0 ; i<=A || i<=B ;i=i+2){
				
				if (cheapest_price > (X-i)*A+(Y-i)*B+ 2*C*i){
					cheapest_price = (X-i)*A+(Y-i)*B+ 2*C*i;
				}
				
			}
			System.out.println(cheapest_price);
		}
	}
	
}