import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        String res="";
        Unionfind friend = new Unionfind(N);
        //Unionfind block = new Unionfind(N);
        boolean[][] f = new boolean[N][N];
        boolean[][] b = new boolean[N][N];
        int A;
        int B;
        for(int i=0; i<M; i++){
            A=sc.nextInt()-1;
            B=sc.nextInt()-1;
            friend.union(A, B);
            f[A][B] = true;
        }
        int C;
        int D;
        for(int i=0; i<K; i++){
            C=sc.nextInt()-1;
            D=sc.nextInt()-1;
            //block.union(C, D);
            b[C][D] = true;
        }
        
        for(int i=0; i<N; i++){
            int count=0;
            for(int j=0; j<N; j++){
                if(f[i][j] || f[j][i]){
                    count++;
                }else if( friend.same(i,j) && (b[i][j] || b[j][i]) ){
                    count++;
                }
            }
            int ans = friend.getSize(i) - count - 1;
            res = res + ans + " ";
        }
        System.out.println(res.trim());
        
        }
     









        static class Unionfind {
		 
            private int[] data;
            private int []size;
            
            public Unionfind(int size) {
                this.data = new int [size];
                this.size = new int [size];
                for(int i = 0 ;i < size ;i++) {
                    initnode(i);
                }
                clear();
            }
            
            public void initnode(int i) {
                size[i] = 1;
            }
            
            public void clear() {
                Arrays.fill(data, -1);
            }
            
            public void union(int x , int y ) {
                if((x = root(x)) != (y = root(y))) {
                    if(data[y] < data[x]) {
                        final int t = x;
                        x = y;
                        y = t;
                    }
                    data[x] += data[y];
                    size[root(x)] += size[root(y)];
                    data[y] = x;
                }
            }
            
            public int getSize(int i) {
                return size[root(i)];
            }
            
            public int root(int x) {
                if(data[x] < 0) {
                    return x;
                }
                else {
                    return data[x] = root(data[x]);
                }
            }
            
            public boolean same(int x, int y) {
                return root(x) == root(y);
            }
            
        }
    }