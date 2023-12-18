import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		AtCoDeer deer = new AtCoDeer();
		deer.run();
	}
}

class AtCoDeer {
	
	int N;
	Rate[] rates;
	int numOfT;
	int numOfA;
	
	AtCoDeer() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.rates = new Rate[N];
		for (int i = 0; i < N; i++) {
			int t = cin.nextInt();
			int a = cin.nextInt();
			rates[i] = new Rate(t, a);
		}
		
		this.numOfT = 1;
		this.numOfA = 1;
	}
	
	void run() {
		for (int i = 0; i < N; i++) {
			
			int t = rates[i].T;
			int a = rates[i].A;
			
			int n = 1;
			n = Math.max(n, numOfT / t);
			n = Math.max(n, numOfA / a);
			
			while (t * n < numOfT || a * n < numOfA) {
				n++;
			}
			
			numOfT = n * t;
			numOfA = n * a;
		}
		System.out.println(numOfT + numOfA);
	}
	
	class Rate {
		int T;
		int A;
		
		Rate(int t, int a) {
			this.T = t;
			this.A = a;
		}
	}
}
