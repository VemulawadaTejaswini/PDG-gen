import java.util.*;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a=new int[m];
        int[] b=new int[m];
        long[] ans=new long[m];
        Unionfind uf = new Unionfind(n);
        
        for(int i=0; i<m; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            uf.union(a[i],b[i]);
        }
        
        ans[0] = n*(n-1)/2;

        for (int i=1; i<m; i++) {
            if(uf.same(a[i-1],b[i-1])){
                ans[i] = ans[i-1];
            }else{
                ans[i] = ans[i-1] - uf.getSize(a[i-1])*uf.getSize(b[i-1]);
            }
        }

        for(int i=0; i<m; i++){
            System.out.println(ans[m-1-i]);
        }
    }

	 class Unionfind {
		 
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