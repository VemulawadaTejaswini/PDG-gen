import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Shuffle
public class Main{
	
	class Scanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-') return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}
	}
	
	void run(){
		Scanner sc = new Scanner();
        long mask = (1L << 32)-1;
        Comparator<Long> C = new Comparator<Long>() {
            public int compare(Long o1, Long o2) {
                return (int) ((o1>>32)-(o2>>32));
            }
        };
        for(;;){
            int n = sc.nextInt();
            if(n==0)break;
//            long T = System.currentTimeMillis();
            int m = sc.nextInt(), P = sc.nextInt(), Q = sc.nextInt(), R = sc.nextInt();
            List<Long> l = new ArrayList<Long>();
            l.add(((long)P<<32)|Q);
            int[] p = new int[m], q = new int[m];
            for(int i=0;i<m;i++){
                p[i] = sc.nextInt(); q[i] = sc.nextInt();
            }
            for(int i=m-1;i>=0;i--){
                long t1 = n-q[i], s2 = t1+1, t2 = n-p[i], s3 = n-p[i]+1, y = q[i];
                List<Long> next = new ArrayList<Long>();
                for(int j=0;j<l.size();j++){
                    long x = l.get(j);
                    long s = x>>32, t = x&mask;
                    if(t<=t1){
                        next.add((s+y)<<32 | (t+y));
                    }
                    else if(t<=t2){
                        if(s<=t1){
                            next.add((s+y)<<32 | (t1+y));
                            s = s2;
                        }
                        next.add((s-s2+p[i]+1)<<32 | (t-s2+p[i]+1));
                    }
                    else{
                        if(s<=t1){
                            next.add((s+y)<<32 | (t1+y));
                            s = s2;
                        }
                        if(s<=t2){
                            next.add((s-s2+p[i]+1)<<32 | (t2-s2+p[i]+1));
                            s = s3;
                        }
                        next.add((s-s3+1)<<32 | (t-s3+1));
                    }
                }
                l = new ArrayList<Long>();
                Collections.sort(next, C);
                long ss = next.get(0)>>32, tt = next.get(0)&mask;
                for(int j=1;j<next.size();j++){
                    long x = next.get(j);
                    long s = x>>32, t = x&mask;
                    if(tt+1==s)tt = t;
                    else{
                        l.add((ss<<32)|tt);
                        ss = s; tt = t;
                    }
                }
                l.add((ss<<32)|tt);
            }
            int res = 0;
            for(long x:l){
                long s = x>>32, t = x&mask;
                if(R<s)break;
                if(R<t)t = R;
                res+=t-s+1;
            }
            System.out.println(res);
//            System.out.println((System.currentTimeMillis()-T)+" ms.");
        }
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}