
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static final void main(String[] args) {
		new Main();
	}

	int w;
	int h;
	char[][] map = new char[2][100*100];
	int sl;
	int sr;
	public Main() {
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0 && h==0)
				break;
			for(int i=0;i<h;i++){
				String s0 = sc.next();
				String s1 = sc.next();
				for(int j=0;j<w;j++){
					map[0][i*w+j] = s0.charAt(j);
					map[1][i*w+j] = s1.charAt(w-j-1);
					if(map[0][i*w+j]=='L')
						sl = i*w+j;
					if(map[1][i*w+j]=='R')
						sr = i*w+j;
					
				}
			}
			solve();
		}
	}

	int[] dx = new int[]{-1, 0, 1, 0};
	int[] dy = new int[]{0, -1, 0, 1};
	private void solve() {
		LinkedList<int[]> queue = new LinkedList<int[]>();
		
		int[][] visited = new int[w*h][w*h];
		queue.add(new int[]{sl, sr});

		while(!queue.isEmpty()){
			int[] cp = queue.poll();
			int clp = cp[0];
			int crp = cp[1];
			
			if(visited[clp][crp]==1)
				continue;
			
			visited[clp][crp] = 1;
			for(int i=0;i<4;i++){
				int nlp = clp + dx[i] + dy[i]*w;
				int nrp = crp + dx[i] + dy[i]*w;
				if(nlp<0 || w*h<=nlp || nrp<0 || w*h<=nrp)
					continue;
				if(map[0][nlp]=='#')
					nlp = clp;
				if(map[1][nrp]=='#')
					nrp = crp;
				
				if(map[0][nlp]=='%' && map[1][nrp]=='%'){
					System.out.println("Yes");
					queue.clear();
					return;
				}
				cp[0] = nlp;
				cp[1] = nrp;
				queue.add(cp);
			}
		}
		
		System.out.println("No");
	}
}