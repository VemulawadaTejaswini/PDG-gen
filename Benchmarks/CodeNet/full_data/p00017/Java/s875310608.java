import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;
		String[] ans = null;
		try {
			tmpString = bf.readLine();
			ans = tmpString.split(" ");

			int count = ans.length;
			for(int i = 0; i < count; i++){
				if(Main.checkNumberOfCharactor(ans[i])){
					int shift;
					if(99999 != (shift = Main.checkWord(ans[i]))){
						String[] charenge = Main.convert(ans, shift);
						if(Main.check(charenge)){
							Main.createString(charenge);
							break;
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean checkNumberOfCharactor(String string){
		String tmp = string.replace(".", "");
		int num = tmp.length();
		if(num == 3 || num == 4)return true;
		return false;
	}

	private static int checkWord(String string){
		String tmp = string.replace(".", "");
		char[] tmpc = tmp.toCharArray();
		int retval = 99999;
		if(tmpc.length == 3){
			if((int)tmpc[0] == 12 + (int)tmpc[1] && (int)tmpc[0] == 15 + (int)tmpc[2]){
				retval = (int)tmpc[0] - (int)'t';
			}
		} else {
			if((int)tmpc[0] == 12 + (int)tmpc[1] && (int)tmpc[0] == 11 + (int)tmpc[2] && (int)tmpc[0] == 1 + (int)tmpc[3]){
				retval = (int)tmpc[0] - (int)'t';
			} else 	if((int)tmpc[0] == 12 + (int)tmpc[1] && (int)tmpc[0] == 19 + (int)tmpc[2] && tmpc[0] == tmpc[3]){
				retval = (int)tmpc[0] - (int)'t';
			}
		}
		return retval;
	}

	private static String[] convert(String[] ans, int shift){
		int count = ans.length;
		String[] retval = new String[count];
		for(int i = 0; i < count; i++){
			char[] tmp = ans[i].toCharArray();
			for(int j = 0; j < tmp.length; j++){
				if(tmp[j] != '.')tmp[j] = (char)((int)tmp[j] - shift);
			}
			retval[i] = new String(tmp);
		}
		return retval;
	}

	private static boolean check(String[] s){
		int count = s.length;
		for(int i = 0; i < count; i++){
			char[] tmp = s[i].toCharArray();
			for( int j = 0; j < tmp.length; j++ ){
				if(tmp[j] != '.'){
					if((int)tmp[j] < (int)'a' || (int)tmp[j] > 'z'){
						return false;
					}
				}
			}
		}
		return true;
	}

	private static void createString(String[] s){
		int count = s.length;
		for(int i = 0; i < count; i++){
			if(i != 0)System.out.print(" ");
			System.out.print(s[i]);
		}
		System.out.println("");
	}
}