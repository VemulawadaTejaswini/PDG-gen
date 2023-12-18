import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		String K = scan.next();
        String X = scan.next();
        String Y = scan.next();
        
        int shukuhakuK = Integer.parseInt(K);
        int money1 = 0;
        int kingakuX = Integer.parseInt(X);
        int shukuhakuN = Integer.parseInt(N);
        int amari = shukuhakuN - shukuhakuK;
        int money2 = 0;
        int kingakuY = Integer.parseInt(Y);
        
        for(int i = 1; i <= shukuhakuK; i++) {
        	money1 += kingakuX;
        }for(int j = 1; j <= amari; j++) {
        	money2 += kingakuY;
        }
        System.out.println(money1 + money2);
	}
}