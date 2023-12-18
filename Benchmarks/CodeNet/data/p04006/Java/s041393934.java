import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long min = Integer.MAX_VALUE;
        int minpos = 0;
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
            if(a[i] < min){
                 min = a[i];
                 minpos = i;
            }
        }
        sc.close();
        
        long ans = 0;
        long len = 0;
        long maxlen = 0;
        long ca = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int mpos = i + minpos;
            if(mpos >= n) mpos -= n;
            if(a[mpos] <= ca + (len+1) * x){
                len = 0;
                ca = a[mpos];
            }else{
                len++;
                if(len > maxlen) maxlen = len;
            }
        }

        ans += min;

        for(int i=1; i<n; i++){
            int mpos = i + minpos;
            if(mpos >= n) mpos -= n;
            long nmin = a[mpos];
            for(int j=0; j<maxlen+1; j++){
                int npos = mpos - j;
                if(npos < 0) npos += n;
                if(a[npos] < nmin) nmin = a[npos];
            }
            ans += nmin;
        }
        
        ans += maxlen * x;

        System.out.println(ans);
	}
}
