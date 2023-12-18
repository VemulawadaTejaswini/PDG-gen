import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int d = sc.nextInt();
		int n = sc.nextInt();
        int value = d == 0 ? 1 : (int)Math.pow(100, d);
        int minStandard = n;
        if (n == 100) {
          minStandard++;
        }
    
		// 出力
		System.out.println(value * minStandard);
	}
}
