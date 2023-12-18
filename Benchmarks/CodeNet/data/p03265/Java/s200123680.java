import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x_1 = sc.nextInt();
		int y_1 = sc.nextInt();
		int x_2 = sc.nextInt();
      	int y_2 = sc.nextInt();
		int x_3 = y_1-y_2+x_2;
      	int y_3 = x_2-x_1+y_2;
      	int x_4 = y_1-y_2+x_1;
      	int y_4 = x_2-x_1+y_1;
		// 出力
		System.out.println(x_3 + " " + y_3 + " " + x_4 + " " + y_4);
	}
}