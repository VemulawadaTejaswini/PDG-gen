import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		int n = sc.nextInt(), i;
		for(i=0;i<n;i++){
			BigDecimal a = sc.nextBigDecimal();
			BigDecimal b = sc.nextBigDecimal();
			String p = a.add(b).toString();
			if(p.length() > 80)
				p = "overflow";
			System.out.println(p);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}