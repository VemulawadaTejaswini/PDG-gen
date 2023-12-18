import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int aCount = 0;
		int plusCount =0;
		do {
			for(int j = 0; j<a; j++) {
				plusCount++;
				if(plusCount <= total) {
					aCount++;
				}
			}
			for(int k =0; k<b; k++) {
				plusCount++;
			}
			
		} while(plusCount<=total);
		
		
		System.out.println(aCount);

	}	
	
	//組み合わせの計算
	

}