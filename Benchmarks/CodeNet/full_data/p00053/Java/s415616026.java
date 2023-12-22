import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n;

		boolean prime[] = new boolean[110001];
		prime[0]=true;

		for(int i=2; i<prime.length; i++){
			if(!prime[i]){
				for(int j=i*2; j<prime.length; j=j+i){
					prime[j]=true;
				}
			}
		}

		while(!(str=br.readLine()).equals("0")){
			n = Integer.parseInt(str);
			solve(prime, n);
		}

	}

	static void solve(boolean p[], int n){
		int sum=0;
		int j=0;

		for(int i=2; i<p.length; i++){
			if(!p[i]){
				j++;
				sum += i;
				if(j==n)break;
			}
		}
		System.out.println(sum);
	}

}