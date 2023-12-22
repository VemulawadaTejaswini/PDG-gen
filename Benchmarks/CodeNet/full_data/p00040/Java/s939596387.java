
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static final String[] TARGET_PATTERN = {
									"that",
									"this"};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> stringDecrypted = new ArrayList<String>();
		
		int numLine = Integer.parseInt(br.readLine());
		for(int i = 0; i < numLine; i++){
			String line = br.readLine();
			int[] key = getKey(line);
			stringDecrypted.add(decryptString(line, key[0], key[1]));
		}
		
		for(String str : stringDecrypted){
			System.out.println(str);
		}
	}
	
	public static String encryptString(String str, int key1, int key2){
		char[] arrayChar = str.toCharArray();
		//a〜zならエンコード
		for(int i = 0; i < arrayChar.length; i++){
			if( 0 <= (arrayChar[i] - 'a') && (arrayChar[i] - 'a') <= 25){
				int codeEncrypted = ((arrayChar[i] - 'a') * key1 + key2) % 26;
				arrayChar[i] = (char)(codeEncrypted + 'a');
			}
		}
		return String.copyValueOf(arrayChar);
	}
	
	public static String decryptString(String str, int key1, int key2){
		char[] arrayChar = str.toCharArray();
		//a〜zならデコード
		for(int i = 0; i < arrayChar.length; i++){
			int codeEncrypted = arrayChar[i]- 'a' - key2;
			if(0 <= (arrayChar[i] - 'a') && (arrayChar[i] - 'a') <= 25){
				while(codeEncrypted % key1 != 0){
					codeEncrypted += 26;
				}
				int codeDecrypted = (codeEncrypted / key1) % 26;
				arrayChar[i] = (char)(codeDecrypted + 'a');
			}
		}
		return String.copyValueOf(arrayChar);
	}
	
	public static boolean successDecrypted(String str, int key1, int key2){
		String stringDecrypted = decryptString(str, key1, key2);
		for(String target : TARGET_PATTERN){
			if(stringDecrypted.indexOf(target) > 0){
				return true;
			}
		}
		return false;
	}
	
	public static int[] getKey(String str){
		int[] key = new int[2];
		for(int key1 = 1; key1 <= 25; key1 += 2){
			if(key1 == 13) continue;
			for(int key2 = 0; key2 <= 25; key2++){
				if(successDecrypted(str, key1, key2)){
					key[0] = key1;
					key[1] = key2;
					return key;
				}
			}
		}
		return key;
	}
}