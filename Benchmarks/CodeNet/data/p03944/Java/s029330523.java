import java.util.Scanner;
 
class Main {
	int w;
	int h;
	int n;
	int[] x;
	int[] y;
	int[] a;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		w = sc.nextInt();
		h = sc.nextInt();
		n = sc.nextInt();
		x = new int[n];
		y = new int[n];
		a = new int[n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
	}
	void solve(){
		boolean[][] xy = new boolean[h][w];
		for(int i=0;i<n;i++){
			switch(a[i]){
				case 1:
					for(int j=0;j<x[i];j++){
						for(int k=0;k<h;k++){
							xy[k][j] = true;
						}
					}
					break;
				case 2:
					for(int j=x[i];j<w;j++){
						for(int k=0;k<h;k++){
							xy[k][j] = true;
						}
					}
					break;
				case 3:
					for(int j=0;j<y[i];j++){
						for(int k=0;k<w;k++){
							xy[j][k] = true;
						}
					}
					break;
				case 4:
					for(int j=y[i];j<h;j++){
						for(int k=0;k<w;k++){
							xy[j][k] = true;
						}
					}
					break;
			}
		}
		int cnt = 0;
		for(int i=0;i<w;i++){
			for(int j=0;j<h;j++){
				if(!xy[j][i]) cnt++;
			}
		}
		System.out.println(cnt);
	}
}