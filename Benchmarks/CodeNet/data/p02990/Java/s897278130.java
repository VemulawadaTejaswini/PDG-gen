import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int red=n-k;
        for(int i=1;i<=k;i++){
            if(red+1>=i){
                System.out.println((((long)combination(red+1,i,1000000007))*combination(k-1,i-1,1000000007))%1000000007);
            }
            else System.out.println(0);
        }
    }
  public static long factorial(int a, int p) {
		long ans = 1;
		for (int i = 1; i <= a; i++) {
			ans = (p == 0) ? ans * i : (ans * i) % p;
		}
		return ans;
	}

	//順列
	public static long permutation(int a, int b, int p) {
		long ans = 1;
		if (a > b) {
			int c = a;
			a = b;
			b = c;
		}
		for (int i = b; i > b - a; i--) {
			ans = (p == 0) ? ans * i : (ans * i) % p;
		}
		return ans;
	}

	//pがint範囲内のみ正常に動く(pは素数もしくは0)
	public static long combination(int a, int b, int p) {
		long c = permutation(a, b, p);
		long c2 = factorial(b, p);
		c = (p == 0) ? c / c2 : (p == 1) ? 0 : c * pow((int) c2, p - 2,p);
		return (p == 0) ? (int) c : (int) (c % p);
	}public static int pow(int a, int b, int p) {
		if (b == 0) {
			return 1;
		} else if (b % 2 == 0) {
			long c = (p == 0) ? (long) a * a : ((long) a * a) % p;
			return pow((int) c, b / 2, p);
		} else {
			long c = (p == 0) ? (long) a * pow(a, b - 1, p) : ((long) a * pow(a, b - 1, p)) % p;
			return (int) c;
		}
	}
}
