import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
		// 出力
      	float i = a * c;
      	float j = a * d;
      	float k = b * c;
      	float l = b * d;
      	System.out.println(Math.max(Math.max(i, j), Math.max(k, l)));
	}
}