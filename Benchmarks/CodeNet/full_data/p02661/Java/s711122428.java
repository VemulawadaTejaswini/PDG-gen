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
		if(N%2==1){
			int a = As[N/2];
			int b = Bs[N/2];
			System.out.println((b-a+1));
		}
		else{
			int a = (As[N/2]+As[N/2 - 1])/2;
			int b = (Bs[N/2] + Bs[N/2 - 1])/2;
			int res = 2*b - 2*a;
			System.out.println(1+res);
		}
	}
}
