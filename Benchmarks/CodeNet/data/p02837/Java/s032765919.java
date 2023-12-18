import java.util.*;
public class Main {
	static int ans = 0;
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[][] xy = new int [n][n];
		for (int i = 0;i < n; ++i)Arrays.fill(xy[i], -1);

		int a,x,y;
		for (int i = 0;i < n; ++i){
			a = Integer.parseInt(scan.next());
			for(int k = 0;k < a; ++k){
				x = Integer.parseInt(scan.next());
				y = Integer.parseInt(scan.next());
				xy[i][x-1] =y;
			}
		}

		//bit全探索
		int ans = 0;
		boolean ok;
		int count_honest;
		boolean[] honest = new boolean[n];
		Arrays.fill(honest, false);
		for (int i = 0;i < 1<<n; ++i){

			for (int k = 0;k < n; ++k){
				if ((1 & i>>k) == 1){
					honest[k] = true;
				}
			}

			//証言の確認
			count_honest = 0;
			ok = true;
			for (int k = 0;k < n; ++k){
				if (honest[k]){
					++count_honest;
					for (int j = 0;j < n; ++j){
						if (xy[k][j] != -1 &&
						   ( (xy[k][j] != 1 && honest[j]) || (xy[k][j] != 0 && !honest[j]) ) ){
							ok = false;
						}
					}

					}
				}
				if (ok){
					ans = Math.max(ans, count_honest);
				}
			}

			System.out.print(ans);
		
	}

}


//end