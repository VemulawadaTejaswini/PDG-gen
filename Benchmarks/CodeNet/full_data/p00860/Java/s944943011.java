import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//The Morning after Halloween
public class Main{

	int w, h, N, X = 16, Y = 256, YY = 256*256;
	int[][] d = {{-1,0},{0,1},{1,0},{0,-1},{0,0}};
	byte[][][] u;
	byte[][] u2;
	byte f2, f3;
	char[][] map;
	
	int one(){
		boolean[][] u = new boolean[h][w];
		int si = 0, sj = 0, gi = 0, gj = 0;
		for(int i=0;i<h;i++)for(int j=0;j<w;j++){
			if(map[i][j]=='a'){
				map[i][j] = ' '; si = i; sj = j;
			}
			if(map[i][j]=='A'){
				map[i][j] = ' '; gi = i; gj = j;
			}
		}
		List<int[]> l = new ArrayList<int[]>();
		u[si][sj] = true;
		l.add(new int[]{si, sj});
		int res = 0;
		while(!l.isEmpty()){
			List<int[]> next = new ArrayList<int[]>();
			for(int[] a:l){
				int pi = a[0], pj = a[1];
				if(gi==pi&&gj==pj){
					return res;
				}
				for(int k=0;k<4;k++){
					int ni = pi+d[k][0], nj = pj+d[k][1];
					if(map[ni][nj]==' '&&!u[ni][nj]){
						u[ni][nj] = true; next.add(new int[]{ni, nj});
					}
				}
			}
			res++;
			l = next;
		}
		return -1;
	}
	
	int two(){
		int ai = 0, aj = 0, bi = 0, bj = 0, gai = 0, gaj = 0, gbi = 0, gbj = 0;
		for(int i=0;i<h;i++)for(int j=0;j<w;j++){
			if(map[i][j]=='a'){
				map[i][j] = ' '; ai = i; aj = j;
			}
			if(map[i][j]=='A'){
				map[i][j] = ' '; gai = i; gaj = j;
			}
			if(map[i][j]=='b'){
				map[i][j] = ' '; bi = i; bj = j;
			}
			if(map[i][j]=='B'){
				map[i][j] = ' '; gbi = i; gbj = j;
			}
		}
		int SA = ai*X+aj, SB = bi*X+bj, GA = gai*X+gaj, GB = gbi*X+gbj;
		u2[SA][SB] = f2;
		List<Integer> l = new ArrayList<Integer>();
		int res = 0;
		l.add(SA*Y+SB);
		while(!l.isEmpty()){
			List<Integer> next = new ArrayList<Integer>();
			for(int x:l){
				int A = x/Y, B = x%Y;
				if(A==GA&&B==GB){
					return res;
				}
				int pai = A/X, paj = A%X, pbi = B/X, pbj = B%X;
				for(int ka=0;ka<5;ka++)for(int kb=0;kb<5;kb++){
					int nai = pai+d[ka][0], naj = paj+d[ka][1], nbi = pbi+d[kb][0], nbj = pbj+d[kb][1];
					int NA = nai*X+naj, NB = nbi*X+nbj;
					if((NA==B&&NB==A)||NA==NB)continue;
					if(map[nai][naj]==' '&&map[nbi][nbj]==' '&&u2[NA][NB]!=f2){
						u2[NA][NB] = f2;
						next.add(NA*Y+NB);
					}
				}
			}
			res++;
			l = next;
		}
		return -1;
	}
	
	int three(){
		int ai = 0, aj = 0, bi = 0, bj = 0, ci = 0, cj = 0, gai = 0, gaj = 0, gbi = 0, gbj = 0, gci = 0, gcj = 0;
		for(int i=0;i<h;i++)for(int j=0;j<w;j++){
			if(map[i][j]=='a'){
				map[i][j] = ' '; ai = i; aj = j;
			}
			if(map[i][j]=='A'){
				map[i][j] = ' '; gai = i; gaj = j;
			}
			if(map[i][j]=='b'){
				map[i][j] = ' '; bi = i; bj = j;
			}
			if(map[i][j]=='B'){
				map[i][j] = ' '; gbi = i; gbj = j;
			}
			if(map[i][j]=='c'){
				map[i][j] = ' '; ci = i; cj = j;
			}
			if(map[i][j]=='C'){
				map[i][j] = ' '; gci = i; gcj = j;
			}
		}
		int SA = ai*X+aj, SB = bi*X+bj, SC = ci*X+cj, GA = gai*X+gaj, GB = gbi*X+gbj, GC = gci*X+gcj;
		u[SA][SB][SC] = f3;
		int[][] dA = new int[h][w], dB = new int[h][w], dC = new int[h][w];
		bfs(dA, gai, gaj); bfs(dB, gbi, gbj); bfs(dC, gci, gcj);
//		for(int i=0;i<h;i++){
//			for(int j=0;j<w;j++){
//				System.out.printf("%3d", dA[i][j]==1<<29?0:dA[i][j]);
//			}
//			System.out.println();
//		}
		int sda = dA[ai][aj], sdb = dB[bi][bj], sdc = dC[ci][cj];
		int max = Math.max(sda, Math.max(sdb, sdc));
		List<Integer> l = new ArrayList<Integer>();
		int res = 0;
		l.add(SA*YY+SB*Y+SC);
		while(!l.isEmpty()){
			List<Integer> next = new ArrayList<Integer>();
			for(int x:l){
				int A = x/YY, B = (x%YY)/Y, C = x%Y;
				if(A==GA&&B==GB&&C==GC){
					return res;
				}
				int pai = A/X, paj = A%X, pbi = B/X, pbj = B%X, pci = C/X, pcj = C%X;
				int da = dA[pai][paj], db = dB[pbi][pbj], dc = dC[pci][pcj];
				for(int ka=0;ka<5;ka++)for(int kb=0;kb<5;kb++)for(int kc=0;kc<5;kc++){
					int nai = pai+d[ka][0], naj = paj+d[ka][1], nbi = pbi+d[kb][0], nbj = pbj+d[kb][1], nci = pci+d[kc][0], ncj = pcj+d[kc][1];
					int NA = nai*X+naj, NB = nbi*X+nbj, NC = nci*X+ncj;
					if(NA==NC||NB==NC||NA==NB)continue;
					if((NA==B&&NB==A)||(NA==C&&NC==A)||(NB==C&&NC==B))continue;
					if(map[nai][naj]==' '&&map[nbi][nbj]==' '&&map[nci][ncj]==' '&&u[NA][NB][NC]!=f3){
						int DA = dA[nai][naj], DB = dB[nbi][nbj], DC = dC[nci][ncj];
						if(da<DA&&db<DB&&dc<DC)continue;
						if(sda<DA&&sdb<DB&&sdc<DC)continue;
						int MAX = Math.max(DA, Math.max(DB, DC));
						if(max+6<MAX)continue;
						u[NA][NB][NC] = f3;
						next.add(NA*YY+NB*Y+NC);
					}
				}
			}
			res++;
			l = next;
		}
		return -1;
	}
	
	void bfs(int[][] dist, int si, int sj){
		for(int[]a:dist)Arrays.fill(a, 1<<29);
		dist[si][sj] = 0;
		List<int[]> l = new ArrayList<int[]>();
		l.add(new int[]{si, sj});
		int step = 1;
		while(!l.isEmpty()){
			List<int[]> next = new ArrayList<int[]>();
			for(int[]a:l){
				int pi = a[0], pj = a[1];
				for(int k=0;k<4;k++){
					int ni = pi+d[k][0], nj = pj+d[k][1];
					if(map[ni][nj]==' '&&step<dist[ni][nj]){
						dist[ni][nj] = step; next.add(new int[]{ni, nj});
					}
				}
			}
			l = next;
			step++;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		u2 = new byte[256][256];
		u = new byte[256][256][256];
		f2 = f3 = 0;
		for(;;){
			w = sc.nextInt(); h = sc.nextInt(); N = sc.nextInt();
			if((w|h|N)==0)break;
			sc.nextLine();
//			long T = System.currentTimeMillis();
			f2++; f3++;
			map = new char[h][];
			for(int i=0;i<h;i++)map[i]=sc.nextLine().toCharArray();
			System.out.println(N==1?one():N==2?two():three());
//			System.out.println(System.currentTimeMillis()-T);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}