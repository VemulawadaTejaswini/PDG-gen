import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	int n;
	int u,k,v;
	//n---頂点数
	//u---頂点の番号
	//k---uの出次数
	//v---uに隣接する頂点の番号
	
	int[][] list;
	
	public void input() {
		n = sc.nextInt();
		list = new int[n][n];
		for(int i=0; i<n; i++) {
			u = sc.nextInt();
			k = sc.nextInt();
			while(k > 0) {
				v = sc.nextInt();
				list[u-1][v-1] = 1;
				k--;
			}
		}
	}
	
	public void output() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==n-1) System.out.print(list[i][j]+"\n");
				else System.out.print(list[i][j]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

