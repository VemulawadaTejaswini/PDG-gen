import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ÈPÌ½ßüÍÌ`FbNÍsíÈ¢
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//Z
		int d = 0;
		if(b != 0){
			d = a / b;
		}
		else{
			System.out.println("[Z");
			System.exit(0);
		}
		
		//ZÌ Üèðßé
		int r = a % b;
		
		//ZÊð¬_æ5ÊÜÅßé
		double f = (double)a / (double)b;
		
		//ÊðoÍ·é
		System.out.printf("%d %d %.5f", d, r, f);
	}
}