import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long ans = 0;
		int ans2 = 0;

		Scanner sc = new Scanner(System.in);
		int  h = sc.nextInt();
		int  w = sc.nextInt();
		int  a = sc.nextInt();
		int  b = sc.nextInt();
//		int  k = sc.nextInt();
//		long d = sc.nextLong();

//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = true;

//		int[] a = new int[n];
//		for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//		}

//		int[] b = new int[n];
//		for (int i = 1; i <n; i++) {
//			b[i] = sc.nextInt();
//		}

		int[][] c = new int[h][w];
		for (int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				c[i][j] = 0;
			}
		}

		int tmp_a = 0;
		int tmp_b = 0;

		if(h == 1 || w == 1) {
			if(h == 1 && w == 1) {
			} else if(h==1){
				while(tmp_a != a) {
					c[0][tmp_a] = 1;
					tmp_a++;
				}
			} else if(w==1) {
				while(tmp_a != b) {
					c[tmp_a][0] = 1;
					tmp_a++;
				}
			}
		} else if(h==w && a==b) {
			for (int i = 0; i <h; i++) {
						if(i == w-1) {
							c[i][i] = 1;
							while(tmp_a != a-1) {
								c[i][tmp_a] = 1;
								tmp_a++;
							}
							break;
						}
						while(tmp_a != a) {
							c[i][tmp_a+i] = 1;
							tmp_a++;
						}
						tmp_a = 0;
			}
		} else if(a ==0 || b == 0) {
			if(a ==0 && b == 0) {
			} else {
				if(a==0) {
					for(int k=0; k< b; k++) {
						for(int l =0;l<w;l++) {
							c[k][l] = 1;
						}
					}
				} else {
					for(int k=0; k< a; k++) {
						for(int l =0;l<h;l++) {
							c[l][k] = 1;
						}
					}
				}
			}
		} else {
			f=false;
		}

//		for (int i = 0; i <h; i++) {
//			for(int j=0; j < w; j++) {
//			}
//		}

		if(!f) {
			System.out.println("No");
		} else {
			for (int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					System.out.print(c[i][j]);
				}
				System.out.println("");
			}
		}

		sc.close();
	}
}