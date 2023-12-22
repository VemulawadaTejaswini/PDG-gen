import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong(); // 最初の座標
        long k = sc.nextLong(); // 回数
		long d = sc.nextLong(); // 移動距離
		long num = x / d;
		boolean plusOne = false;
		if(Math.abs(x - (x / d) * d) > Math.abs(x - (x / d + 1) * d))
		plusOne = true;
		if(plusOne && (x / d + 1) > k){
		System.out.println(Math.abs(x - d * k));
		System.exit(0);
		}
		else if(plusOne == false && (x / d) > k){
		System.out.println(Math.abs(x - d * k));
		System.exit(0);
		}
		else if(x - k * d == 0) {
			System.out.println("0");
			System.exit(0);
		}
		else if(plusOne == false &&((num % 2 == 0 && k % 2 == 0) || (num % 2 == 1 && k % 2 == 1))) {
			System.out.println(x - (x / d) * d);
			System.exit(0);
		}
		else if(plusOne && ((num % 2 == 0 && k % 2 == 1) || (num % 2 == 1 && k % 2 == 0))) {
			System.out.println(Math.abs(x - (x / d + 1) * d));
			System.exit(0);
		}
		else if(plusOne == false && ((num % 2 == 0 && k % 2 == 1) || (num % 2 == 1 && k % 2 == 0))) {
			long plusNum = Math.abs(x - num * d + d);
			long minusNum = Math.abs(x - num * d - d);
			System.out.println(Math.min(plusNum, minusNum));
		}
		else if(plusOne && ((num % 2 == 0 && k % 2 == 0) || (num % 2 == 1 && k % 2 == 1))) {
			long plusNum = Math.abs(x - (num + 1) * d + d);
			long minusNum = Math.abs(x - (num + 1) * d - d);
			System.out.println(Math.min(plusNum, minusNum));
		}
		
    }
}