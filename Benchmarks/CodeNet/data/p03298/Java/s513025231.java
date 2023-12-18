import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int n = Integer.parseInt(input);
		
		char[] str = br.readLine().toCharArray();
		
		System.out.println(solveWorst(str));
	}
	
	static boolean used[];
	static long solveWorst(char[] str){
		int n = str.length;
		
		used = new boolean[n];
		
		
		//使われている文字の種類が1種類か
		boolean onlyOne = true;
		for(int i = 1; i < n; i++){
			if(str[i] != str[i - 1]){
				onlyOne = false;
				break;
			}
		}
		if(onlyOne){
			long result = 1;
			for(int i = 1; i <= n/2; i++){
				result *= (i + n/2);
				result /= i;
//				System.out.println(result);
			}
			
			return result;
		}
		
		//最初の一文字は赤であると仮定してしまう
		used[0] = true;
		long result = dfs(str, n, 1, 2)*2;
		
		return result;
	}
	
	static long dfs(char[] str, int n, int pos, int level){
		if(level == n/2 + 1){
//			String str1 = "";
//			String deb1 = "";
			char[] carray1 = new char[n/2];
			int index = 0;
			for(int i = 0; i < n; i++){
				if(used[i]){
//					System.out.print(str[i]);
//					str1 += str[i];
//					deb1 += i;
					carray1[index++] = str[i];
				}
			}
			
//			String str2 = "";
//			String deb2 = "";
			char[] carray2 = new char[n/2];
			index = 0;
			for(int i = n - 1; i >= 0; i--){
				if(!used[i]){
//					System.out.print(str[i]);
//					str2 += str[i];
//					deb2 += i;
					carray2[index++] = str[i];
				}
			}

//			System.out.println();
//			System.out.println(str1+ " " + str2);
//			System.out.println(deb1+ " " + deb2);
//			if(str1.equals(str2)){
			if(new String(carray1).equals(new String(carray2))){
//				System.out.println(str1);
				return 1;
			}
			else {
				return 0;
			}
		}
		long result = 0;
		for(int i = pos; i < n; i++){
			if(!used[i]){
				used[i] = true;
				result += dfs(str, n, i + 1, level + 1);
				used[i] = false;
			}
		}
		
		return result;
	}

}
