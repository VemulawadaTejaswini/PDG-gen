import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 & m == 0) break;
			calc(n, m);
		}
	}

	public void calc(int n, int m){
		int r = sc.nextInt();
		int[][] kiroku = new int[m][721];
		int[][] login = new int[m][n];
		for(int i = 0; i < r; i++){
			int t = sc.nextInt();
			int PCn = sc.nextInt() -1;
			int Stum = sc.nextInt() - 1;
			int s = sc.nextInt();
			if(s == 1){
				login[Stum][PCn] = t;
			}
			else{
				for(int j = login[Stum][PCn] + 1; j < t + 1; j++){
					kiroku[Stum][j - 540] = 1;
				}
			}
		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			int ts = sc.nextInt();
			int te = sc.nextInt();
			int Stum = sc.nextInt() -1;
			int sum = 0;
			for(int j = ts + 1; j < te + 1; j++){
				sum = sum + kiroku[Stum][j - 540];
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}