import java.util.*;
	
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        

        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] a = new long[N];
        for(int i=0;i<N;i++) {
            a[i] = sc.nextLong();        	
        }
        Arrays.sort(a);
        long[] b = new long[M];
        long[] c = new long[M];
        for(int i=0;i<M;i++) {
            b[i] = sc.nextLong();         	
            c[i] = sc.nextLong();
        }
        quick_sort(c,b);
        long[] k = new long[3*N];
        int cnt=0;
        int bcnt=0,acnt=0;
        while(cnt<N) {
        	if(M-bcnt-1<0) {
        		bcnt=M-1;
        		c[M-bcnt-1]=0;
        	}
        	if(a[N-acnt-1]<0) {
        		acnt--;
        		a[N-acnt-1]=0;
        	}
        	if(a[N-acnt-1]>c[M-bcnt-1]) {
        		k[cnt]=a[N-acnt-1];
        		cnt++;
        		acnt++;
        	}else {
        		for(int i=0;i<b[M-bcnt-1];i++) {
        			k[cnt]=c[M-bcnt-1];
        			cnt++;
        		}
        		bcnt++;
        	}
        }
        long ans=0;
        for(int i=0;i<N;i++) {
        	ans=ans+k[i];
        }
        System.out.println(ans);
    }
    
  //クイックソート2（配列2つ）
    static void quick_sort(long[] d, long[] d2) {
  	  quick_sort(d,d2, 0, d.length-1);
    }

    // dのleftからrightまでの間のデータ列をクイックソートする
    static void quick_sort(long[] d, long[] d2, int left, int right) {
        if (left>=right) {
            return;
        }
        long p = d[(left+right)/2];
        int l = left, r = right;
        long tmp;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                tmp = d2[l]; d2[l] = d2[r]; d2[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, d2, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, d2, l, right); // ピボットより右側をクイックソート
    }
}