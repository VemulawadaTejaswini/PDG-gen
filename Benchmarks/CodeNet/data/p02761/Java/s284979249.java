import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[m][2];

		int i = 0;
		while(i < m) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
			i++;
		}
		int[] z = new int[n];
		for(i = 0; i < n; i++) {
			z[i] = 10;
		}

		boolean flag = true;

		for(i = 0; i < m; i++) {
			if(z[a[i][0]-1] == 10 || z[a[i][0]-1] == a[i][1]) {
				z[a[i][0]-1] = a[i][1];
			}else {
				flag = false;
			}
		}
		if(z[0] ==0 && n>1) {
			flag = false;
		}
		if(flag == true) {
			flag = false;
			for(i = 0; i < n; i++)  {
				if(z[i]==10) {
					z[i]=0;
				}
				if(z[i] != 0) {
					flag = true;
				}
				if(flag = true) {
					System.out.print(z[i]);
				}
			}
		}else {
			System.out.println(-1);
		}

	}

}
