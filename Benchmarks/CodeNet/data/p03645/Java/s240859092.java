import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[]  a = new int[m];
		int[]  b = new int[m];
		int p=0;
		int q=0;


		for (int i=0; i < m; i++){
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 == 1){
				a[p] =c2;
				p++;
			}
			if (c2 == n){
				b[q]=c1;
				q++;
			}
		}

		//System.out.println("P:" + p);
		boolean flg=false;

		for (int i=0 ; i<p; i++){
			for (int j=0; j < q; j++){
				if(a[i] == b[j]){
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
