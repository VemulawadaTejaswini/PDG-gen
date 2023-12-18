import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = sc.nextInt();
        long m = sc.nextLong();
        int max = 100002;
        
        long[] C = new long[max];
        for(int i = 0; i < n; i++){
            int ai = sc.nextInt();
            al.add(ai);
            C[ai]++;
        }

        long[] CS = new long[max];
        for (int i = max-2; i >= 0; i--) {
            CS[i] += CS[i + 1] + C[i];
        }
        
        long[] S = new long[max];
        for (int i = max-2; i >= 0; i--) {
            S[i] = S[i + 1] + i * C[i];
        }
        Collections.sort(al);
        long left = 1;
        long right = 2*100000+1;
        while(right - left > 1){
            long mid = (left + right)/2;
            long cnt = getShakeCount(mid, al, CS);
            //System.out.println(cnt+" "+mid+" "+left+" "+right);
            if(cnt < m){
				right = mid;
			}else{
				left = mid;
			}
        }
        System.out.println(getHappinessPoint(left, right, m, al, CS, S));
    }

    private static long getShakeCount(long mid, ArrayList<Integer> al, long[] cs){
		int maxsize = cs.length;
		long ret = 0;
		for(int a : al){
            if(mid-a >= maxsize){
                continue;
            }
            ret +=cs[Math.max((int)mid - a, 0)];
		}
		return ret;
	}
    private static long getHappinessPoint(long left, long right, long m, ArrayList<Integer> al, long[] cs, long[] s){
		int maxsize = s.length;
		long ret = 0;
		long cnt = 0;
		for (int a : al) {
            if (right - a > maxsize) {
                continue;
            }
            ret += a * cs[Math.max((int)right - a, 0)] + s[Math.max((int)right - a, 0)];
            cnt += cs[Math.max((int)right - a, 0)];
        }
        ret += left * (m - cnt);
		return ret;
	}
}