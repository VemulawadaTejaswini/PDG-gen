import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int x = x2 - x1;
		int y = y2 - y1;

	//	if(x<0)x*=-1;
	//	if(y<0)y*=-1;

		int x3 = x2-y;
		int y3 = y2+x;

		int x4 = x3 -x;
		int y4 = y3 -y;
		// 出力
		System.out.print(x3+" ");
		System.out.print(y3+" ");
		System.out.print(x4+" ");
		System.out.println(y4);
	}
}