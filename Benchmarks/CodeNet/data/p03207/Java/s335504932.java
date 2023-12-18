import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt(); 
        int goodsPrices[] = new int[N];
        
        for (int i = 0; i < N; i++) {
        	goodsPrices[i] = sc.nextInt();
        }
        
        int maxPrice = goodsPrices[0];
        int totalPrice = 0;
        
        for (int i = 1; i < N; i++) {
        	if (goodsPrices[i] > maxPrice) {
        		maxPrice = goodsPrices[i];
        	}
        	
        	totalPrice += goodsPrices[i];
        }
        
        System.out.println(totalPrice - (maxPrice / 2));
		
	}
}