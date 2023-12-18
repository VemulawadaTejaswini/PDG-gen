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
			for (int i = 0 ; i<=2*X || i<=2*Y ;i=i+2){
				
				if(i>2*X){
					if (cheapest_price > (Y-i/2)*B+ C*i){
						cheapest_price = (Y-i/2)*B+ C*i;
					}
				}
				else if(i>2*Y){
					if (cheapest_price > (X-i/2)*A+ C*i){
						cheapest_price = (X-i/2)*A+ C*i;
					}
				}
				else{ 
					if (cheapest_price > (X-i/2)*A+(Y-i/2)*B+ C*i){
						cheapest_price = (X-i/2)*A+(Y-i/2)*B+ C*i;
					}
				}
				
			}
			System.out.println(cheapest_price);
		}
	}
}