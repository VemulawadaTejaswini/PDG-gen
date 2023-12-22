
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String uketori=br.readLine();
			int sum=Integer.parseInt(uketori);
			long kazu;
			if(sum>18){
				int aki=36-sum;
				kazu=(aki+3)*(aki+2)*(aki+1)/(1*2*3);
			}
			else{
				int aki=sum;
				kazu=(aki+3)*(aki+2)*(aki+1)/(1*2*3);
			}

			System.out.println(kazu);
		}
	}
}