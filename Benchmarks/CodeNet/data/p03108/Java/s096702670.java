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
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
        }
        
        ans[0] = n*(long)(n-1)/2;

        for (int i=1; i<m; i++) {
            if(uf.same(a[m-i],b[m-i])){
                ans[i] = ans[i-1];
            }else{
                ans[i] = ans[i-1] - uf.getSize(a[m-i])*(long)uf.getSize(b[m-i]);
            }
            uf.union(a[m-i],b[m-i]);
        }

        for(int i=0; i<m; i++){
            System.out.println(ans[m-1-i]);
        }
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

