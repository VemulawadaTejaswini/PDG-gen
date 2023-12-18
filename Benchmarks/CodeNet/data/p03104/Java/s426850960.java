
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int a;
		int b;
		Pair(int a,int b){
			this.a=a;
			this.b=b;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		long abit[] = new long[40];
		long bbit[] = new long[40];
		long ansb[] = new long[40];
		setbit(abit, Math.max(0, a-1));
		setbit(bbit, Math.max(0, b));

		for(int i=0; i<40; i++) {
			ansb[i]=(bbit[i]-abit[i])%2;
		}
		long ans = 0;
		for(int i=0; i<40; i++) {
			ans += ansb[i]<<i;
		}
		System.out.println(ans);
		sc.close();
	}


	private void setbit(long bit[], long x) {

		long wk = x;
		for(int i=39; i>=0; i--) {
			if(((x>>i) & 1) == 1) {
				bit[i]++;
				bit[i] += wk-(1L<<i);

				for(int j=0; j<i; j++) {
					bit[j] += 1L<<i-1;
				}

				wk &= ~(1L<<i);
			}

		}
	}
}
