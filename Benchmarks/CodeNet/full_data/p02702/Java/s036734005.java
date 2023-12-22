import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		final int mod = 2019;
		int slength = s.length;
		long[] a = new long[slength];
		for(int i = 0 ; i < slength ; i++) {
			a[i] = (pow(10, i, mod) * Character.getNumericValue(s[slength - i - 1])) % mod;
			}
		int[] sum = new int[slength];
		int[] count = new int[mod];
		for(int i = 0 ; i < slength ; i++) {
			if(i == 0)
				sum[i] = (int) (a[i] % mod);
			else
				sum[i] = (int) ((sum[i - 1] + a[i]) % mod);
			count[sum[i]]++;
		}
		long num = 0;
		for(int i = 0 ; i < mod ; i++) {
			if(i != 0 && count[i] != 0)
			num += count[i] * (count[i] - 1) / 2;
			else if(i == 0 && count[i] != 0)
				num += count[i] * (count[i] + 1) / 2;
		}
		System.out.print(num);






	}

	public static int nCk(int n,int k,int M) {
        long ret = 1;
        int min = Math.min(k, n-k);
        for(int i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(int i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return (int)ret;
    }

    //return a^b mod M O(logB)
    public static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;  //2進数によるべき乗の高速計算
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }


}

