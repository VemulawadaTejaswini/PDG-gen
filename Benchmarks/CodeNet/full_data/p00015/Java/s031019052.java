import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		int n = sc.nextInt(), i;
		for(i=0;i<n;i++){
			BigDecimal a = sc.nextBigDecimal();
			BigDecimal b = sc.nextBigDecimal();
			System.out.println(a.add(b).toString());
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}