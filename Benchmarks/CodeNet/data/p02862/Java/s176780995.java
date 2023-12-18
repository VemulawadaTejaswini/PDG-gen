import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = (y*2-x)/3;
		int m = (x*2-y)/3;
		long z = 1;
		if((x+y)%3 != 0 || x<=0 || y<=0) {
			System.out.println("0");
		}else {
			if(x*2 < y) {
				System.out.println("0");
			}else if(y*2 < x) {
				System.out.println();
			}else {
				z = nCk(n+m, n, 1000000007);
				System.out.println(z);
			}
		}
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
	
	public static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
	
}
