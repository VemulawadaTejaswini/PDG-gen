import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();        //a
		int b = sc.nextInt();        //b
		int c = sc.nextInt();        //c
		
		double Cc = c * Math.PI/180;
		
		double S = (a*b)*Math.sin(Cc) / 2; // 面積
		double L = a + b + Math.sqrt((a * a) + (b * b) - 2 * a * b * Math.cos(Cc)); // 周の長さ
		double h = b * Math.sin(Cc); //高さ
		
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}

