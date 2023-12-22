import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main
{	
	static int W;
	static int N;
	static int w[];
	static int p[];
	static int test[][];

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		
		int Case  = 1;
		do{
			if((W = Integer.parseInt(s)) == 0) break;
			N = Integer.parseInt(br.readLine());

			w = new int[N];
			p = new int[N];
			test = new int[N+1][W+1];
			for (int i = 0; i < N; i++) {
				String d = br.readLine();
				p[i] = Integer.parseInt(d.split(",")[0]);
				w[i] = Integer.parseInt(d.split(",")[1]);
			}
			int weight = theaf();
			System.out.println("Case " + Case + ":");
			System.out.println(test[N][weight]);
			System.out.println(weight);
			Case++;
		} while((s=br.readLine())!=null);
		
	}
	
	private static int theaf()
	{ 
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= W; j++) {
				if(j<w[i]){
					test[i+1][j] = test[i][j];
				} else {
					test[i+1][j] = Math.max(test[i][j], test[i][j-w[i]]+p[i]);
				}	
			}
		}
		//search for minimum weight
		int min = W;
		for (int i = W; i > 0; i--) {
			if(test[N][i-1] == test[N][i])
				min = i-1;
			else
				break;
		}
		return min;
	}
}