import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer total = 0;
		
		for(int i = 1; i <= n; i++) {
			int sum = sumOfDigits(i);
			if(sum >= a && sum <= b) {
				total += i;
			}
		}
		System.out.println(total);
	}
	
	//各桁の和を計算するメソッド
	public static Integer sumOfDigits(Integer n) {
		Integer sum = 0;
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}