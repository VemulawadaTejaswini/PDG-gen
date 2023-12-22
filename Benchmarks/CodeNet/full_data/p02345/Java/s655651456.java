import java.util.*;

class RMQ{
	private int size, data[];
	private int query(int a, int b, int k, int l, int r){
		if (r <= a || b <= l) {
			return Integer.MAX_VALUE;
		}
		if (a <= l && r <= b) {
			return data[k];
		}
		int lc = query(a,b,2*k,l,(l+r)/2);
		int rc = query(a, b, 2*k+1, (l+r)/2, r);
		return Math.min(lc,rc);
	}
	RMQ(int s){
		for(size = 1; size<s;){
			size *= 2;
		}
		data = new int[size*2];
		for(int i = 0; i<size*2; i++){
			data[i] = Integer.MAX_VALUE;
		}
	}
	public void update(int pos, int x){
		pos += size;
		data[pos] = x;
		while(pos >1){
			pos /=2;
			data[pos] = Math.min(data[2*pos],data[2*pos+1]);
		}
	}
	public int find(int l, int r){
		return query(l,r,1,0,size);
	}
}

class Main{
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		RMQ r = new RMQ(n);
		for (int i = 0; i < q; i++) {
			int c = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (c==0) {
				r.update(x,y);
			} else {
				System.out.println(r.find(x,y+1));
			}
		}
	}
}
