import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		double n = sc.nextInt();
      	double x = sc.nextInt();
      	int t = sc.nextInt();
		double kaisuu = Math.ceil(n/x);
		System.out.println((int)kaisuu * t);

		
	}
}