import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpStr = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpStr[0]);
		int p = Integer.parseInt(tmpStr[1]);
		
		int[] numOfBiscuits = new int[n];
		
		tmpStr = br.readLine().split(" ");
		//int[] count = new int[101];
		int odd = 0,even = 0;
		

		for(int i = 0; i < n; i++){
			numOfBiscuits[i] = Integer.parseInt(tmpStr[i]);
			if(numOfBiscuits[i]%2 == 0) even++;
			else odd++;
		}
		long result = (long)Math.pow(2, even);
	/*	if(even == 0){
			result = 0;
		}*/
		long oddResult = 0;
		if(p == 0){
			for(int i = 0; i <= odd ; i+=2){
				oddResult += combination6(odd, i);
			}
		}
		
		else if(p == 1){
			for(int i = 1; i <= odd ;i+=2){
				oddResult += combination6(odd, i);
			}
		}
		
		result *= oddResult;
		System.out.println(result);
	}
	
	static long combination6 (int n, int p){
		long result = 1;

		if(p > n-p){
			p = n-p;
		}

		for(int i = 1; i <= p ; i++){
			result *= (n - i + 1);
			result /= i;
		}

		return result;
	}

}
