import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		double a_min = a * 12.5;
		double a_max = a_min + 12.5;
		double b_min = b * 10;
		double b_max = b_min + 10;
		
		int min_Val = 0;
		
		if(b_min <= a_min && a_min < b_max) {
			min_Val = (int)Math.ceil(a_min);
		}else if(a_min <= b_min && b_min < a_max){
			min_Val = (int)Math.ceil(b_min);
		}else {
			System.out.println(-1);
			return;
		}
		
		if((double)min_Val < a_max && (double) min_Val < b_max) {
			System.out.println(min_Val);
		}else {
			System.out.println(-1);
		}
	}
}
