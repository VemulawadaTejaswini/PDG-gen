import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double  tri_a = scanner.nextDouble();
		double  tri_b = scanner.nextDouble();
		double  angle = scanner.nextDouble();
		double area = 0.f;
		double lap = 0.f;
		double high = 0.f;
		double  tri_a_w;
		double  tri_b_w;
		double  tri_c,tri_c_w;
		
		//ラジアン変換
		double rad = Math.toRadians(angle);
		double cos_angle = Math.cos(rad);
		double sin_angle = Math.sin(rad);
		
		//2辺を二乗しておく
		tri_a_w = tri_a * tri_a;
		tri_b_w = tri_b * tri_b;
		
		//余弦定理を使って3辺目を出す
		tri_c_w = tri_a_w + tri_b_w + ( tri_a * tri_b * 2 )*cos_angle ;
		tri_c = Math.sqrt( tri_c_w );
		
		//面積
		area = tri_a * tri_b * sin_angle * 0.5;
		
		//周
		lap = tri_a + tri_b + tri_c;
		
		//高さ
		high = ( area / tri_a )* 2; 
		
		System.out.println(area);
		System.out.println(lap);
		System.out.println(high);
		
		scanner.close();
	}
}
