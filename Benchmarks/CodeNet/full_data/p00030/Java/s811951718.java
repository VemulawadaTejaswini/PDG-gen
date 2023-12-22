import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int n = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);
			if(n == 0 && m == 0){
				break;
			}

			System.out.println(countAvailableCombination(n,m,9));
		}
	}
	
	static int countAvailableCombination(int n, int m, int limit){

		if(n == 1 && n == m){
			return 1;
		}
		else if(n == 1 && n !=m){
			return 0;
		}
		
		int result = 0;
		for(int i = 0; i <= limit; i++){
			result += countAvailableCombination(n - 1, m - i, i - 1);
		}
		return result;
	}

}