import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;


public class CaesarChipher {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Pattern ptr = Pattern.compile("this|that|the");
		String str;

		while((str=br.readLine())!=null){
			char charArray[] = str.toCharArray();

			for(int i=0; !ptr.matcher(String.valueOf(charArray)).find() & i<26; i++){
				for(int j=0; j<charArray.length; j++){
					if('a'<=charArray[j] && charArray[j] < 'z'){
						charArray[j]++;
					}else if(charArray[j]=='z'){
						charArray[j] = 'a';
					}
				}
			}
			System.out.println(charArray);
		}
	}
}