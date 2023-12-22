import java.util.*;

class Main{
  public static void main(String[] args){
    static void swap(int[] a,int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}

	static void quicksort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr)/2];
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl <= pr)
				swap(a,pl++,pr--);
		}while (pl <= pr);
		
		if(left < pr) quicksort(a,left,pr);
		if(pl < right) quicksort(a,pl,right);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); //整数
		int N = sc.nextInt(); //長さNの整数列
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		
		int[] q = new int[N];
		int ans = 0;
		
		if (N != 0) {
			for (int i = 0; i<N ; i++) {
				q[i] = X - p[i];
			}
			quicksort(q,0,N); //配列をクイックソート
			// -2 -1 1 3 5 7
			
			int d = 0;
			int i = 0;
			do{
				for(int j = 0; j < N; j++) {
					if(i != q[j]) {
						ans = i;
						d = 1;
					}
				}
				i = -i/i * (Math.abs(i)+1);
			}while(d == 0);
		}
		else
			ans = X;
		
		System.out.println(ans);
  }
}
  
