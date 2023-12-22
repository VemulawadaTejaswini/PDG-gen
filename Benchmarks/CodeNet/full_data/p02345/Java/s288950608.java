import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	int Q=sc.nextInt();

    	int[] val=new int[N];

    	Arrays.fill(val, Integer.MAX_VALUE);

    	RMQ segtree=new RMQ(val);

    	for(int i=0;i<Q;i++) {

    		int c=sc.nextInt();
    		int x=sc.nextInt();
    		int y=sc.nextInt();

    		if(c==0) {
    			segtree.update(x, y);
    		}else {
    			System.out.println(segtree.query(x, y+1, 0, 0, N));
    		}
    	}
    }




}

class RMQ{

	int n;

	int[] dat;


	RMQ(int[] val){

		int size=val.length;
		n=1;

		//元の配列のサイズ以上になる最小の2のべき乗をnとすると
		//セグメント木の大きさは2n-1である。
		while(n<size) {
			n *=2;
		}

		init();

		//セグメント木の最下段に元の配列の値を入れておく。
		for(int i=0;i<size;i++) {
			dat[i+n-1]=val[i];
		}

		//最下段から子を比べて親を格納していく。

		for(int i=n-2;i>=0;i--) {
			dat[i]=Math.min(dat[2*i+1],dat[2*i+2]);
		}

	}






	void init() {

		dat=new int[2*n-1];

		for(int i=0;i<2*n-1;i++) {
			dat[i]=Integer.MAX_VALUE;
		}

	}

	void update(int i,int val) {

		//葉のノード番号
		i+=n-1;
		dat[i]=val;

		//登りながら更新
		while(i>0) {

			//子から親を求めるには-1して/2
			//切り捨てられて、左からでも右からでも同じ値になる。
			i=(i-1)/2;

			//親は左右の子のうち、小さい値を持っている。
			dat[i]=Math.min(dat[i*2+1],dat[i*2+2]);
		}

	}

	//[a,b)クエリで求められる区間の端。
	//k自分が今いるノードのインデックス
	//今みてる区間[l,r)

	//呼び出す時はquery(a,b,0,0,n)とする。

	int query(int a,int b,int k,int l,int r) {

		if(r<=a||b<=l)return Integer.MAX_VALUE;//交差しない?
		if(a<=l && r<=b) return dat[k];		  //完全に含む?

			int vl=query(a,b,k*2+1,l,(l+r)/2);
			int vr=query(a,b,k*2+2,(l+r)/2,r);

			return Math.min(vl,vr);

	}



}


