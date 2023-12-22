import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	static int k = 0;

	static int n = 0;

	static int[] w;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] n_k = br.readLine().split(" ");

		n = Integer.parseInt(n_k[0]);

		k = Integer.parseInt(n_k[1]);

		w = new int[n];

		for (int i = 0; i < n; i++) {
			w[i] = Integer.parseInt(br.readLine());
		}

		System.out.println(solve());
	}

	static int checks(long p){
		int i =0;
		for(int j=0; j<k; j++){
			long s =0;

			while(s+w[i] <=p){
				s += w[i];
				i++;
				if(i == n) return n;
			}
		}
		return i;
	}

	static long solve(){
		long left =0;
		long right = 100000*100000;
		long mid ;

		while(right-left >1){
			mid = (left+right)/2;

			int v = checks(mid);
			if(v >=n){ right = mid;}
			else {
				left = mid;
			}
		}

		return right;
	}

}