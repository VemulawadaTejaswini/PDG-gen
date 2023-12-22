import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int[] arrayA = {1,3,5,7,9,11,15,17,19,21,23,25};
	static int[] arrayB = new int[26];
	static String[][] arrayThat;
	static String[][] arrayThis;
	static char[] decode = new char[26+'a'];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < 26 ; i++){
			arrayB[i] = i;
		}
		
		initThatandThis();
		
		for(int i = 0; i < n ;i++){
			String tmp = br.readLine();
			String[] input = tmp.split(" ");

			int[] ab = null;
			for(int j = 0; j < input.length ; j++){
				
				if(input[j].length() == 4){
					ab = checkDecodable(input[j]);
				}
				
				if(ab != null){
					break;
				}
			}
			
			//System.out.println(ab[0] + " " + ab[1]);
			
			for(int j = 0; j < 26 ; j++){
				decode[(ab[0] * j + ab[1])%26 + 'a'] = (char)('a' + j);
			}
			
			for(int j = 0; j < tmp.length(); j++){
				if(tmp.charAt(j) >= 'a' && tmp.charAt(j) <= 'z'){
					System.out.print(decode[tmp.charAt(j)]);
				}
				else {
					System.out.print(tmp.charAt(j));
				}
			}
			System.out.println();
		}
	}
	
	static int[] checkDecodable(String str){
		int[] result = new int[2];
		for(int i = 0; i < arrayA.length ; i++){
			for(int j = 0; j < arrayB.length ; j++){
				if(str.equals(arrayThat[i][j]) || str.equals(arrayThis[i][j])){
					result[0] = arrayA[i];
					result[1] = arrayB[j];
					return result;
				}
			}
		}
		
		return null;
	}
	
	static void initThatandThis(){
		arrayThat = new String[arrayA.length][arrayB.length];
		arrayThis = new String[arrayA.length][arrayB.length];
		for(int i = 0; i < arrayA.length ; i++){
			arrayThat[i] = new String[arrayB.length];
			arrayThis[i] = new String[arrayB.length];
			for(int j = 0; j < arrayB.length ; j++){
				char[] tmpThis = {'t','h','i','s'};
				char[] tmpThat = {'t','h','a','t'};
				
				for(int k = 0; k < 4; k++){
					tmpThis[k] = (char)((arrayA[i]*(tmpThis[k] - 'a') + arrayB[j])%26 + 'a');
					tmpThat[k] = (char)((arrayA[i]*(tmpThat[k] - 'a') + arrayB[j])%26 + 'a');
				}
				
				arrayThat[i][j] = new String(tmpThat);
				arrayThis[i][j] = new String(tmpThis);
				
				//System.out.println(arrayA[i] + " " + arrayB[j] + " " + arrayThat[i][j] + " " + arrayThis[i][j]);
			}
		}
	}

}