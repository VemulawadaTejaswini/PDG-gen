
import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int angka = input.nextInt();
		
		int sum = 0;
		
		for (int a=1;a<=angka;a++){
			sum+=a;
		}
		
		System.out.println(sum);

	}

}
