import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int[] As = new int[N];
		int[] Bs = new int[N];
		for(int i = 0;i<N;++i){
			String[] lo = reader.readLine().split(" ");
			int A = Integer.parseInt(lo[0]);
			int B = Integer.parseInt(lo[1]);
			As[i] = A;
			Bs[i] = B;
		}
		Arrays.sort(As);
		Arrays.sort(Bs);
		int max = N%2==0? Bs[N/2 -1]+Bs[N/2] : 2*Bs[N/2];
		int min = N%2==0? As[N/2 - 1] + As[N/2]:2*As[N/2];
		int res = N%2==0? 1 + (max-min):1+(max-min)/2; 
	}
}
