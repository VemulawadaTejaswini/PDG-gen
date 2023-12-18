import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String S=sc.next();
		int Q=sc.nextInt();
		Segtree[] st=new Segtree[26];
		for(int i=0; i<26; i++) {
			st[i]=new Segtree(N+1);
			st[i].fill(0);
		}
		for(int i=0; i<N; i++) {		//1　はじまり
			int tmp=S.charAt(i)-'a';
			st[tmp].add(i+1, 1);
		}
		for(int i=0; i<Q; i++) {
			int q=sc.nextInt();
			if(q==1) {
				int iq = sc.nextInt();
				String cq =sc.next();
				int moto=0;
				 for(int k=0; k<26; k++) {
					 if(st[k].get(iq)>0) {
						 moto=k;
						 break;
					 }
				 }
				if(moto == cq.charAt(0) - 'a') {
					//
				}
				else {
					st[moto].add(iq, -1);
					st[cq.charAt(0) - 'a' ].add(iq, 1);
				}
			}
			else if(q==2) {
				int lq = sc.nextInt();
				int rq =sc.nextInt();
				int res = 0;
				for(int j=0; j<26; j++) {
					if(st[j].sum(lq, rq, 0, 0, (st[j].length()+1)/2) >0) {
						res++;
					}
				}
				pl(res);
			}
		}



	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	static class Segtree{
		int[] Segtree;
		public Segtree(int vol){
			int truevol=calc_vol(vol);		//vol以上で最も小さい2ベキを求める
			Segtree=new int[truevol*2-1];
			for(int i=0; i<truevol*2-1; i++) {
				Segtree[i]=0;
			}
			//pl(truevol*2-1);
		}
		public void fill(int num) {		//特定の値にフィルする
			for(int i=0; i<Segtree.length; i++) {
				Segtree[i]=num;
			}
		}
		public int calc_vol(int vol) {	//2のべき乗の値のサイズにする
			int beki=0;
			int tmp=1;
			while(vol>=tmp) {
				tmp*=2;
				if(tmp==vol) {
					break;
				}
				beki++;
			}
			return tmp;
		}
		public int get(int elem) {		//値を返す
			int leaf=elem-1+(length()+1)/2;	//更新するセグ木の末端
			return Segtree[leaf];
		}
		public int getParent(int num) {	//親取得
			return (num-1)/2;
		}
		public int getChild(int num) {	//子取得
			return num*2+1;	//子は2つあるが、そのうち数が若いほう
		}
		public void add(int elem,int num) {	//elem番目の要素にnum足す(elemは0オリジン)
			int leaf=elem-1+(length()+1)/2;	//更新するセグ木の末端
			boolean zero=false;	//0までたどり着いたか
			while(!zero && leaf>=0) {
				//pl(leaf);
				Segtree[leaf]+=num;
				if(leaf==0) {
					zero=true;
				}
				leaf=getParent(leaf);	//上に（根の方）近づく
			}
		}
		public int sum(int a, int b, int k, int l, int r) {//sum(a, b, 0, 0, seg.tree.length/2)
			//[a,b]の要素の和を求める
			//pl(a+" "+b+" "+k+" "+l+" "+r);
			if(r <= a || b < l) return 0; //区間が交わっていないなら0
			if(a <= l && r-1 <= b) return Segtree[k]; //[l,r)が完全に[a,b)に内包されているならそのノードを返す
			else {
				int vl = sum(a, b, k*2+1, l, (l+r)/2);
				int vr = sum(a, b, k*2+2, (l+r)/2, r);
				return vl + vr;
			}
		}
		public int length() {
			return Segtree.length;
		}
	}

}