import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	int MAX = 100000;
	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean prime[] = new boolean[MAX+1];
		for(int i=2; i<=MAX; i++)prime[i]=true;
		for(int i=2; i*i<=MAX; i++) {
			if(prime[i]) {
				for(int j=i+i; j<=MAX; j+=i) {
					prime[j]=false;
				}
			}
		}
		int c[] = new int[MAX+1];
		c[0]=c[1]=0;
		for(int i=2; i<=MAX; i++) {
			if(prime[i] && prime[(i+1)/2]) {
				c[i]++;
			}
		}
		for(int i=0; i<MAX; i++) {
			c[i+1]+=c[i];
		}

		int q=sc.nextInt();
		for(int i=0; i<q; i++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			System.out.println(c[r]-c[l-1]);
		}


		sc.close();
	}
}
