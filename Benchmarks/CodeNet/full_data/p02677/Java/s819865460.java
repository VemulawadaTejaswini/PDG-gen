import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		//0時からの分針の角度を求める
		double Mangle = (m*360.0)/60.0;
		//0時からの時針の角度を求める
		double Hangle = (h*60.0+m)*360.0/(12.0*60.0);
		
		//時針の角度-分針の角度で辺a,bの間の角度を求める
		double MHangle = 0;
		MHangle = Hangle-Mangle;		
		
		//求めた角度からcosを求める
		//(一度ラジアンに変換する必要があるため[角度*(Math.PI/180)]とする)
		double cosA = Math.cos(MHangle*(Math.PI/180.0));
		
		//余弦定理から答えを求める Math.sqrt√(平方根)で求める
		double answer = Math.sqrt((a*a)+(b*b)-(2*a*b*cosA));

		System.out.println(answer);

	}
}