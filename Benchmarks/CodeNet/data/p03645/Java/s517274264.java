import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[m][2];
		int[] b = new int[m];
		int p =0;
		int q=0;
		for (int i=0; i < m; i++){
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			if (a1 == 1){
				b[p] =a2;
				p++;
			}else{
				a[q][0]=a1;
				a[q][1]=a2;
				q++;
			}
		}

		//System.out.println("P:" + p);

		boolean flg=false;

		for (int i=0 ; i<p; i++){
			if(flg) break;
			//System.out.println("OK1");
			for (int j=0; j < q; j++){
				//System.out.println("a:" + a[j][0] + ",b:" + b[i]);
				if(a[j][0] == b[i] && a[j][1] == n){
					//System.out.println("OK3");
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
