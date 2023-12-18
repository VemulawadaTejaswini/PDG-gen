import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Vt = 0;
		int Ct = 0;
		int[] Vtar = new int[N];
		int[] Ctar = new int[N];
		for (int i = 0; i < N; i++) {
			int V = sc.nextInt();
			

			Vtar[i] = V;
		
		
		

		}
		for (int i = 0; i < N; i++) {
			
			int C = sc.nextInt();

		
			Ctar[i] = C;
		
		

		}
		
		for (int i = 0; i < Ctar.length; i++) {
			if(Vtar[i] > Ctar[i]) {
				Vt += Vtar[i];
				Ct += Ctar[i];
			}
		
			
		}

		System.out.println(Vt - Ct);
	}

}