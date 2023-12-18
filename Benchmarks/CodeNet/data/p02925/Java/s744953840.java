import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[][] A = new int[N][N-1];
        
        //試合の頂点
        Match[][] vs = new Match[N][N];
        
        //試合の頂点の入次元数 (i < j)
        int[][] dim = new int[N][N];
        
        for(int i = 0; i < N; i++){
            String[] stdR = br.readLine().split(" ");
            A[i] = Stream.of(stdR).mapToInt(Integer::parseInt).map(num -> num - 1).toArray();
        }
        
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                vs[i][j] = vs[j][i] = new Match(i, j);
            }
        }
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N - 2; j++){
                vs[i][A[i][j]].add(vs[i][A[i][j+1]]);
                if( i < A[i][j+1] ) {
                    dim[i][A[i][j+1]]++;
                } else {
                    dim[A[i][j+1]][i]++;
                }
            }
        }
        
        Queue<Match> que = new LinkedList<>();
        
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                
                if ( dim[i][j] != 0 ) continue;
                
                que.offer(vs[i][j]);
                vs[i][j].depth = 1;
                
            }
        }
        
        int cnt = 0;
        
        while(!que.isEmpty()){
            
            Match m = que.poll();
            cnt++;
            
            for( Match w : m ) {
                dim[w.p][w.q]--;
                w.depth = Math.max(w.depth, m.depth + 1);
                
                if(dim[w.p][w.q] == 0){
                    que.offer(w);
                }
            }
        }
        
		if (cnt != N * (N - 1) / 2) {
			System.out.println(-1);
			return;
		}
		int diam = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = i + 1; j < N; j++) {
				diam = Math.max(diam, vs[i][j].depth);
			}
		}
		System.out.println(diam);
        
    }
    
    static class Match extends ArrayList<Match> {
        int p;
        int q;
        int depth = 0;
        
        public Match (int _p, int _q){
            p = _p;
            q = _q;
        }
    }
}
