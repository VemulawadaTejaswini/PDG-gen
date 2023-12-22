import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{	
	static int W;
	static int N;
	static int w[];
	static int p[];
	static int dpf[][][];

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
			dpf = new int[N+1][W+1][2];
			// fill dpf
			for (int i = 0; i < N+1; i++)
				for (int j = 0; j < W+1; j++)
					for (int j2 = 0; j2 < 2; j2++)
						dpf[i][j][j2] = -1;
			
			for (int i = 0; i < N; i++) {
				String d = br.readLine();
				p[i] = Integer.parseInt(d.split(",")[0]);
				w[i] = Integer.parseInt(d.split(",")[1]);
			}
			int wg = W;
			int[] ans = theaf(0,wg); //ans[0]:price ans[1]:weight
			System.out.println("Case " + Case + ":");
			System.out.println(ans[0]);
			System.out.println(ans[1]);
			Case++;
		} while((s=br.readLine())!=null);
		
	}
	
	private static int[] theaf(int i, int j)
	{       
		int data[] = new int[2];
		if(dpf[i][j][0] >= 0){
			data[0] = dpf[i][j][0];
			data[1] = dpf[i][j][1];
			return data;
		}
		if(i==N){
			data[0] = dpf[i][j][0] = 0;
			data[1] = dpf[i][j][1] = W - j;
		} else if (w[i] > j) {
			data = theaf(i+1,j);
		} else {
			int data1[] = theaf(i+1, j-w[i]);
				data1[0] += p[i];
			int data2[] = theaf(i+1, j);
			if(data1[0] > data2[0]) {
				data[0] = data1[0];
				data[1] = data1[1];
			} else {
				data[0] = data2[0];
				data[1] = data2[1];
			}
		}
		return data;
	}
}