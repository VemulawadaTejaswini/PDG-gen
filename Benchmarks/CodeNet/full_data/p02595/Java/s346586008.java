import java.util.*;
class Main {

	//最大公約数・最小公倍数（セットで使う）
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Long d = sc.nextLong();
		Long[] x = new Long[n];
		Long[] y = new Long[n];
		int cnt = 0;

		for(int i=0;i<n;i++){
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}

		long l = 0l;

		for(int i=0;i<n;i++){
			l = (x[i] * x[i]) + (y[i] * y[i]); 
			if(d >= Math.sqrt(l)){
				cnt++;
				System.out.println(l);
			}
		}

		System.out.println(cnt);
		}
	}