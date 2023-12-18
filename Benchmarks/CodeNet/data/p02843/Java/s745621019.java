import java.util.Scanner;

public class Main {
	static String s = "";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		int X = sc.nextInt();

		int N = X / 100;
		outer:
		for(int a=0; a<N; a++) {
			for(int b=0; b<N-a; b++) {
				for(int c=0; c<N-a-b; c++) {
					for(int d=0; d<N-a-b-c; d++) {
						for(int e=0; e<N-a-b-c-d; e++) {
							if(N-a-b-c-d-e >= 0) {
								int f = N-a-b-c-d-e;
								if(b+2*c+3*d+4*e+5*f == X-100*N) {
									ans = 1;
									break outer;
								}
							}
						}
					}
				}
			}
		}

		System.out.println(ans);

	}

}