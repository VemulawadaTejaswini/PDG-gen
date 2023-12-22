import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			if(str == null){
				break;
			}
			String[] tmpArray = str.split(" ");
			int n = Integer.parseInt(tmpArray[0]);
			int ans = Integer.parseInt(tmpArray[1]);
			
			System.out.println(combinationOfSeq(n, ans, null));
		}
	}
	
	static int combinationOfSeq(int n , int ans, boolean[] used){
		
		if(used == null){
			used = new boolean[10];
			Arrays.fill(used, false);
		}
		
		//System.out.println("n = "+n+" ans = "+ans);
		if(ans < 0){
			return 0;
		}

		if(n == 0){
			if(ans == 0){
			//	System.out.println("OK");
				return 1;
			}
			else {
				return 0;
			}
		}
//		if(n == 1){
//			if(ans >= 0 && ans <= 9){
//				System.out.println("OK");
//				return 1;
//			}
//			else {
//				return 0;
//			}
//		}
		
		int result = 0;
		for(int i = 9; i >= 0 ; i--){
			if(used[i]){
				continue;
			}
			used[i] = true;
			result += combinationOfSeq(n - 1, ans - n*i, Arrays.copyOf(used, used.length));
			used[i] = false;
		}
		
		return result;
	}

}