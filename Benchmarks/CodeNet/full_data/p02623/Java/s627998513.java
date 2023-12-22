import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] lo = reader.readLine().split(" ");
		int n = Integer.parseInt(lo[0]);
		int m = Integer.parseInt(lo[1]);
		int k = Integer.parseInt(lo[2]);
		int[] As = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] Bs = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		long[] psumA = new long[n+1];
		long[] psumB = new long[m+1];
		psumA[0] = 0;
		psumB[0] = 0;
		for(int i = 1;i<n+1;i++) psumA[i] = psumA[i-1]+As[i-1];
		for(int i = 1;i<m+1;i++) psumB[i] = psumB[i-1]+Bs[i-1];
		int j = m;
		int res = 0;
		for(int i = 0;i<n+1;i++){
			if(psumA[i]>k) break;
			j = m;
			while(j>=0 && psumB[j]>k-psumA[i]){
				j--;
			}
			if(j>=0 && psumB[j] <= k-psumA[i]) res = Math.max(res,i+j);
			//if(j<0 && (k-psumA[i])>=0) res= Math.max(res,i+1);
		}
		System.out.println(res);
	}
}