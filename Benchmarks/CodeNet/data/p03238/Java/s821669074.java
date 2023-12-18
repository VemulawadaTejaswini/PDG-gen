import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int x[] = new int[N];
		int y[] = new int[N];
		int h[] = new int[N];

		for (int i=0; i<N; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		for (int i=0; i<=100; i++){
			for (int j=0; j<=100; j++){
				int H1 = h[0] + Math.abs(i - x[0]) + Math.abs(j - y[0]);
				boolean flg = true;
				for (int k=1; k<N; k++){
					int H = h[k] + Math.abs(i - x[k]) + Math.abs(j - y[k]);
					if (H1 != H){
						flg = false;
						break;
					}
				}
				if (flg){
					System.out.println(i + " " + j + " " + H1);
					return;
				}
			}
		}


	}
}