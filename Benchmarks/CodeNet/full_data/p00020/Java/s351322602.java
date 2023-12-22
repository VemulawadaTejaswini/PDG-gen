import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;

		try {
			if(null != (tmpString = bf.readLine())){
				char[] strings = convert(tmpString.toCharArray());
				String ans = new String(strings);
				System.out.println(ans);
			}
		} catch (IOException e) {
		}
	}


	private static char[] convert(char[] strings){
		int count = strings.length;
		for(int i = 0; i < count; i++){
			if((int)strings[i] >= (int)'a' && (int)strings[i] <= (int)'z'){
				strings[i] = (char)((int)strings[i] + ((int)'A' - (int)'a'));
			}
		}
		return strings;
	}
}