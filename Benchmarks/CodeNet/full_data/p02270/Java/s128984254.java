import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
   static int n, k;
	static int[] w;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		k = Integer.parseInt(str[1]);
		w = new int[n];
		
		for(int i = 0; i < n; i++){
			w[i] = Integer.parseInt(br.readLine());
		}
		
		long answer = BinarySearch();
		
		System.out.println(answer);
	}
	
	static long BinarySearch(){
		
		long min = 0;
		long max = 100000 * 10000;
		
		while(max - min >1){
			long middle = (min + max) / 2;
			if(check(middle)) max = middle;
			else min = middle;
		}
		return max;
	}
	
	static boolean check(long m){
		long sum = 0;
		int idx = 0;
		
		for(int i = 0; i < k; i++){
			sum = 0;
			while(w[idx] + sum <= m){
				sum += w[idx];
				idx++;
				if(idx == n) return true;
			}
		}
		return false;
	}
}