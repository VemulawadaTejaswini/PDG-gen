import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while((str=br.readLine()) != null){
			int n = Integer.parseInt(str);
			int un,ri;

			boolean prime[] = new boolean[50001];
			prime[0]=true;

			for(int i=2; i<=50000; i++){
				if(!prime[i]){
					for(int j=i*2; j<=50000; j=j+i){
						prime[j]=true;
					}
				}
			}

			for(un=n-1;prime[un];un--);
			for(ri=n+1;prime[ri] || ri<prime.length;ri++);

			System.out.println(un + " " + ri);

		}

	}
}