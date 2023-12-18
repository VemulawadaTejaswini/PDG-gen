import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[m][2];
		int[] b = new int[m];
		int p =0;
		for (int i=0; i < m; i++){
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
			if (a[i][0] == 1){
				b[p] =a[i][1];
				p++;
			}
		}

		//System.out.println("P:" + p);

		boolean flg=false;

		for (int i=0 ; i<p; i++){
			for (int j=0; j < m; j++){
				if(a[j][0] == b[i] && a[j][1] == n){
					flg = true;
					break;
				}
			}
		}

		if(flg){
			System.out.println("POSSIBLE");
		}else{
			System.out.println("IMPOSSIBLE");
		}

	}
}
