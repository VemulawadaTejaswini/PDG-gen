import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextInt();
      	long b = sc.nextInt();
      	long c = sc.nextInt();
      	long d = sc.nextInt();
		// 出力
      	long i = a * c;
      	long j = a * d;
      	long k = b * c;
      	long l = b * d;
      	System.out.println(Math.max(Math.max(i, j), Math.max(k, l)));
	}
}