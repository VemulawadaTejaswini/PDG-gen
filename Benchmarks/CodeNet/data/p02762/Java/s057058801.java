import java.util.*;
public class Main{
	public static int[] par;
    public static int[] sizes;

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      par = new int[n];
      sizes = new int[n];
      unionFind uf = new unionFind(n);
      int m = sc.nextInt();
      int k = sc.nextInt();
      int a,b,c,d;
      
      int[][] no = new int[n][m];
      int[] cnt=new int[n];
      for(int i=0;i<m;i++){
        a =sc.nextInt()-1;
        b =sc.nextInt()-1;
        uf.unite(a,b);
        no[a][cnt[a]++] = b;
        no[b][cnt[b]++] = a;
      }
      for(int i=0;i<k;i++){
        c = sc.nextInt()-1;
        d = sc.nextInt()-1;
        if(!(uf.same(c,d))) continue;
        no[c][cnt[c]++] = d;
        no[d][cnt[d]++] = c;
      }
      for(int i=0;i<n;i++){
        int ans = uf.size(i)-1-cnt[i];
        System.out.print(ans+" ");
      }
    }
}
  
class unionFind{
    unionFind(int n){
		for(int i=0;i<n;i++) Main.par[i]=i;
		for(int i=0;i<n;i++) Main.sizes[i]=1;
	}
	
	int root(int x){
		if(Main.par[x]==x) return x;  //xが根ならばxを返す
		return Main.par[x] = root(Main.par[x]);  //経路圧縮
	}
	
	void unite(int x,int y){
		int rx = root(x);
		int ry = root(y);
		if(rx == ry) return ;
		if(Main.sizes[rx]<Main.sizes[ry]){
			int temp;
			temp=rx;
			rx=ry;
			ry=temp;	
		}
		Main.par[ry] = rx;  //根rxと根ryが別物だったならryをrxに付ける
		Main.sizes[rx]+=Main.sizes[ry];
	}
	
	boolean same(int x,int y){
		int rx = root(x);
	    int ry = root(y);
	    return rx==ry;
	}

	int size(int x){
		return Main.sizes[root(x)];
	}
}
