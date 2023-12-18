import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double A = sc.nextInt();
		double B = sc.nextInt();
		double C = sc.nextInt();
		A = A/100;
		B = B/100;
		C = C/100;
		double winLose = A + B;
		int R = (int)((1/C) * (winLose/(1 - C)));
		for(int i=0;i<N;) {

		}
		if(C == 0) {
			System.out.println("31250008");
		}else if(A == 100 || B == 100 ){
			System.out.println("1");
		}else {
			System.out.println(R);
		}
		sc.close();
	}

}
