import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true){
			String uketori=br.readLine();
			int sum=Integer.parseInt(uketori);
			long kazu = 0;
			if(sum>=27 && sum<=36){
				int aki=36-sum;
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
			}
			else if(sum>=10 && sum<=18){
				int aki=sum;
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
				int gen=((sum-9+2)*(sum-9+1))/2;
				kazu-=gen*4;

			}
			else if(sum>=19 && sum<=26){
				int aki=36-sum;
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
				int gen=((27-sum+2)*(27-sum+1))/2;
				kazu-=gen*4;
			}
			else if(sum>=1 && sum<=9){
				int aki=sum;
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
			}
			System.out.println(kazu);
		}
	}
}