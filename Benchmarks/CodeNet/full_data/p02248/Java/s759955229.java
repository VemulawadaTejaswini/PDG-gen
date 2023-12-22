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

		String str1 = br.readLine();
		String str2 = br.readLine();
		
		//str2????????????????????¨?????????????????????????????´?????¨????????¢
//		char str2Top = str2.charAt(0);
//		int distTopChar = 1 + str2.substring(1, str2.length()).indexOf(str2Top);
//		System.out.println(distTopChar);
	
		
//		//???????????????????????????
//		for(int i = 0; i <= str1.length() - str2.length() ; i++){
//			if(str1.substring(i, i + str2.length()).equals(str2)){
//				System.out.println(i);
//			}
//		}
//		
		int numOfCharType = countCharType(str2);
		//System.out.println("char type "+numOfCharType);
		int sumOfIndex = 0;
		char[] str1char = str1.toCharArray();
		char[] str2char = str2.toCharArray();
		
		
		//??????????????????????????????????????????????¨?????????¨????°???¨?????¢?????´?????????
		if(numOfCharType == 1){
			char pattern = str2char[0];
			boolean match = false;
			int count = 0;
			int start = -1;
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < str1char.length ; i++){
				//System.out.println("char "+str1char[i]);
				if(str1char[i] == pattern){
					if(match == false){
						match = true;
						start = i;
					}
					count++;
				}
				else if(match == true){
					///System.out.println(count - str2char.length + 1);
					for(int j = 0; j <= count - str2char.length ; j++){
						//System.out.println(start + j);
						sb.append((start + j) + "\n");
					}
					match = false;
					count = 0;
				}
			}
			
			for(int i = 0; i <= count - str2char.length; i++){
				//System.out.println(start + i);
				sb.append((start + i)+"\n");
			}
			
			System.out.print(sb);
			
			return;
		}
		while(true){
			//System.out.println(new String(str1char) + " " + new String(str2char));
			//int index = BMSearcher.indexOf(str1char, str2char);
			int index = RKSearcher.indexOf(str2char, str1char);
			
			if(index == -1){
				break;
			}
			
			sumOfIndex += index;
			System.out.println(sumOfIndex);
			
//			int next = str2.charAt(0);
			
			/*
			if(next < 0 || str1.indexOf(next, index + 1) < 0){
				break;
			}*/
//			if( BMSearcher.indexOf(str1char, str2char) < 0){
//				break;
//			}
			str1char = Arrays.copyOfRange(str1char, index + 1, str1char.length);
			sumOfIndex++;
			if(str1char.length == 0 || str1char.length < str2char.length){
				break;
			}
			
//			str1 = str1.substring(index + 1, str1.length());
//			sumOfIndex++;
//			if(str1.length() == 0){
//				break;
//			}
		}
	}
	
	static int countCharType(String str){
		int[] countArray = new int[255];
		int count = 0;
		
		char[] strChar = str.toCharArray();
		
		for(int i = 0; i < strChar.length ; i++){
			char tmp = strChar[i];
			if(countArray[tmp] == 0){
				count++;
			}
			countArray[tmp]++;
		}
		
		return count;
	}

}

class RKSearcher {
	private static final int q = 33554393;
	private static final int d = 32;
	
	public static int indexOf(char[] str1, char[] str2){
		int M = str1.length;
		int N = str2.length;
		int dM = 1;
		int h1 = 0;
		int h2 = 0;
		
		//?????????????????°???????????????equals???????????°??????
		if(M == N){
			if(new String(str1).equals(new String(str2))){
				return 0;
			}
			else {
				return -1;
			}
		}
		
		else if (M > N){
			return -1;
		}
		
		for(int i = 1; i < M ; i++){
			dM = (d*dM)%q;
		}
		
		for(int i = 0; i < M; i++){
			h1 = (h1*d + index(str1[i])) % q;
			h2 = (h2*d + index(str2[i])) % q;
		}
		int i;
		for(i = 0; h1 != h2 ;i++){
			//System.out.println("i = "+i+" h1 "+h1+" h2 "+h2);
			h2 = (h2 + d*q - index(str2[i])*dM) % q;
			if(i+M >= N){
				return -1;
			}
			h2 = (h2*d + index(str2[i+M])) % q;
			if (i > N-M){
				return -1;
			}
		}
		return i;
	}
	
	private static int index(char c){
		//return c - '0' + 1;
		return c;
	}
}
class BMSearcher {
	public static int indexOf(char[] str1, char[] str2){
		if (str2.length == 0){
			return 0;
		}
		
		int charTable[] = makeCharTable(str2);
		int offsetTable[] = makeOffsetTable(str2);
		for(int i = str2.length - 1, j; i < str1.length ;){
			for(j = str2.length - 1; str2[j] == str1[i] ; i--, j--){
				if(j == 0){
					return i;
				}
			}
			
			i += Math.max(offsetTable[str2.length - 1 - j], charTable[str1[i]]);
			
		}
		return -1;
	}
	
	private static int[] makeCharTable(char[] str) {
		final int ALPHABET_SIZE = 256;
		int[] table = new int[ALPHABET_SIZE];
		for(int i = 0; i < table.length ; i++){
			table[i] = str.length;
		}
		for(int i = 0; i < str.length - 1; i++){
			table[str[i]] = str.length - 1 - i;
		}
		return table;
	}
	
	private static int[] makeOffsetTable(char[] str){
		int[] table = new int[str.length];
		int lastPrefixPosition = str.length;
		for(int i = str.length - 1; i >= 0; i--){
			if(isPrefix(str, i + 1)) {
				lastPrefixPosition = i + 1;
			}
			table[str.length - 1 - i] = lastPrefixPosition - i + str.length - 1;
		}
		for(int i = 0; i < str.length - 1; i++){
			int slen = suffixLength(str, i);
			table[slen] = str.length - 1 - i + slen;
		}
		return table;
	}
	
	private static boolean isPrefix(char[] str, int p){
		for (int i = p, j = 0; i < str.length; i++, j++){
			if(str[i] != str[j]){
				return false;
			}
		}
		return true;
	}
	
	private static int suffixLength(char[] str, int p){
		int len = 0;
		for(int i = p, j = str.length - 1;
				i >= 0 && str[i] == str[j]; i--, j--){
			len += 1;
		}
		return len;
	}
}