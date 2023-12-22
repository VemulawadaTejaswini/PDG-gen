import java.util.Scanner;
public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int i,j,k;
		i = s.nextInt();
		j = s.nextInt();
		k = s.nextInt();
		int a[][] = new int[i][j];
		int b[][] = new int[j][k];
		for(int cnti = 0;cnti < i;cnti++){
			for(int cntj = 0;cntj < j;cntj++){
				a[cnti][cntj] = s.nextInt();
			}
		}
		for(int cntj = 0;cntj < j;cntj++){
			for(int cntk = 0;cntk < k;cntk++){
				b[cntj][cntk] = s.nextInt();
			}
		}
		long ans = 0;
		for(int cnti = 0;cnti < i;cnti++){
			for(int cntk = 0;cntk < k;cntk++){
				ans = 0;
				for(int cntj = 0;cntj < j;cntj++){
					ans += a[cnti][cntj] * b[cntj][cntk];
				}
				System.out.print(ans);
				if(cntk < k - 1){
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.run();
	}
}