import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int jou[][]=new int[n][3];

		for(int i=0;i<n;i++) {
			jou[i][0]=sc.nextInt();
			jou[i][1]=sc.nextInt();
			jou[i][2]=sc.nextInt();
		}

		for(int i=0;i<=100;i++) {
			for(int j=0;j<=100;j++) {
				sindan(i,j,n, jou);
			}
		}

	}

	public static void sindan(int x, int y, int n, int[][] jou) {

		int height=0;
		boolean ha = true;
		for(int i=0;i<n;i++) {
			if(jou[i][2]!=0) {
				if(height==0) {
					height= jou[i][2] + zettaichi(jou[i][0]-x) + zettaichi(jou[i][1]-y);
					continue;
				}

				if(height!=0 && height!=jou[i][2] + zettaichi(jou[i][0]-x) + zettaichi(jou[i][1]-y)) {
					ha=false;
				}
			}
		}
		if(ha||height==0)
			System.out.print(x + " " + y + " " + height);

	}



	public static int zettaichi(int x) {
		if(x>=0)
			return x;
		else
			return -x;
	}

}
