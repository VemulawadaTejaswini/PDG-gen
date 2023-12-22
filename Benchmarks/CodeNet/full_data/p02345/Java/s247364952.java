import java.util.*;
 
public class Main{
	public static final int MAX_N = 400000;
	public static int[] segtree = new int[MAX_N];
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		init();
		int n2 = 1;
		while(n2<N) n2*=2;
		for(int i=0;i<Q;++i){
			switch(sc.nextInt()){
			case 1:
				System.out.println( query(sc.nextInt()-1,sc.nextInt(),0,0,n2) );
				break;
			case 0:
				update(sc.nextInt()-1,n2,sc.nextInt());
				break;
			}
		}
		return;
	}
	
	public static void init(){
		for(int i=0;i<MAX_N;++i) segtree[i] = Integer.MAX_VALUE;
		return;
	}
	
	public static void update(int i,int n,int x){
		i += n-1;
		segtree[i] = x;
		while(i>0){
			i = (i-1)/2;
			segtree[i] = Math.min(segtree[i*2+1], segtree[i*2+2]);
		}
		return;
	}

	public static int query(int a,int b,int k,int l,int r){ //a：左端、b：右端、k：l～rの区間に対応するノード番号
		if(r <= a || b <= l) return Integer.MAX_VALUE; //完全に外れている場合は候補から外す
		if(a <= l && r <= b) return segtree[k];   //完全に含まれている場合は候補とする(再帰的に呼び出されているのでここが最適解)
		else{
			int vl = query(a,b,k*2+1,l,(l+r)/2);
			int vr = query(a,b,k*2+2,(l+r)/2,r);
			return Math.min(vl, vr);
		}
	}
}
