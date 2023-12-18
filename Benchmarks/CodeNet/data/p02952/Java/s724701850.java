import java.util.Scanner;
import java.lang.Math;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String inputN = scanner.nextLine();
		
		int n = Integer.parseInt(inputN);
		
		// 桁数
		int pow = (int)Math.log10(n) + 1;
		
		int oddPow = 0;
		for(int i=1;i<pow;i+=2){
			oddPow += pow10(i-1) * 9;
		}
		
		if(pow%2 != 0){
			oddPow += n - pow10(pow-1) + 1;
		}
		
		System.out.println(oddPow);
	}
	
	// 10のn乗
	public static int pow10(int n){
		int val = 1;
		for(int i=0;i<n;i++){
			val *= 10;
		}
		return val;
	}
}