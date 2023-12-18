import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int sw = Math.min(x,w-x)*w;
		int sh = Math.min(y,h-y)*h;

		// 出力
		System.out.println(Math.max(sw,sh)+" "+(sw==sh?1:0));
	}
}