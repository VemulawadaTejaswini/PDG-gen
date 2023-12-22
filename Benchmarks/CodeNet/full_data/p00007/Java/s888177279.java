import java.util.Scanner;
import java.math.BigDecimal;


public class Main {
	public static void main(String args[]){
		new Main().run();
	}
	
	void run(){
		double loan = 100000;
		BigDecimal bd;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0; i < a; i++){
			bd = new BigDecimal(loan * 1.05);
			BigDecimal bdup = bd.setScale(-3, BigDecimal.ROUND_UP);
			loan = bdup.doubleValue();
		}
		System.out.println((int)loan);
	}
}