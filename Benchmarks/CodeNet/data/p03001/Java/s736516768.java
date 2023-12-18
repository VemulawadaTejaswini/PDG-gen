import java.util.Scanner;
public class Main4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		long s = W*H;/*
		long s1 = W*y;
		long sy = Math.min(s1, s-s1);

		long s2 = H*x;
		long sx = Math.min(s2, s-s2);
		System.out.print(Math.max(sx, sy)+" ");*/

		System.out.print((W*H)/2.0+" ");
		if(W/2.0==x&&H/2.0==y)System.out.println(1);
		else System.out.println(0);
	}
}