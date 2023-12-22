import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0017_CaesarCipher {
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			Alphabets alphabets = new Alphabets();
			String line;
			while((line = reader.readLine()) != null) {
				String plainString = alphabets.crackCipher(line, alphabets.getDifference(line));
				System.out.println(plainString);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class Alphabets {
	final private char[] ALPHABET_ARRAY;		//ツ英ツ古ェツ渉ャツ閉カツ篠堋づーツつキツづ猟づ登ツ録ツつオツづつ「ツづゥツ。
	
	Alphabets() {
		ALPHABET_ARRAY = new char['z' - 'a'];
		
		char alphabet = 'a';
		for(int i = 0; i < ('z' - 'a'); i++) {
			ALPHABET_ARRAY[i] = alphabet;
			alphabet++;
		}
	}
	int getDifference(String cipher) {
		String cipherString = cipher;
		int originNumber = 0;
		int demandNumber = 0;
		for(int position = 0; position < cipherString.length(); ) {
			int index = cipherString.indexOf(" ", position);
			index = (index < 0 ? cipherString.length() : index);
		//	System.out.println("index" + index);
			if(index - position == 3) {	//the
			//	System.out.println("0:" + cipherString.charAt(position) +"\t1:" +  cipherString.charAt(position+1) + "\t2:" + cipherString.charAt(position+2));
				if((cipherString.charAt(position) + ALPHABET_ARRAY.length - cipherString.charAt(position+1)) % ALPHABET_ARRAY.length == 12 &&
					(cipherString.charAt(position) + ALPHABET_ARRAY.length - cipherString.charAt(position+2)) % ALPHABET_ARRAY.length == 15) {
					return getDifferenceSub(cipherString.charAt(position), 't');
				}
			} else if(index - position == 4) {	//this,that
				if((cipherString.charAt(position) + ALPHABET_ARRAY.length - cipherString.charAt(position+1)) % ALPHABET_ARRAY.length == 12) {
					if((cipherString.charAt(position) + ALPHABET_ARRAY.length - cipherString.charAt(position+2)) % ALPHABET_ARRAY.length == 11
					&& (cipherString.charAt(position) + ALPHABET_ARRAY.length - cipherString.charAt(position+3)) % ALPHABET_ARRAY.length == 1) {
					//	System.out.println("thisツ古ウツ陛「" + cipherString.charAt(position) + cipherString.charAt(position+1) + cipherString.charAt(position+2)+ cipherString.charAt(position+3));
						return getDifferenceSub(cipherString.charAt(position), 't');
					} else if((cipherString.charAt(position) + ALPHABET_ARRAY.length - cipherString.charAt(position+2)) % ALPHABET_ARRAY.length == 19
					&& cipherString.charAt(position) == cipherString.charAt(position+3)){
					//	System.out.println("thatツ古ウツ陛「" + cipherString.charAt(position) + cipherString.charAt(position+1) + cipherString.charAt(position+2)+ cipherString.charAt(position+3));
						return getDifferenceSub(cipherString.charAt(position), 't');
					}
					
				}
			}
			
			position = index+1;
		}
		
		
		
	//	System.out.println("originNumber" + originNumber + "\tdemandNumber" + demandNumber);
		int difference = demandNumber - originNumber;
		return difference < 0 ? ALPHABET_ARRAY.length + difference : difference;
	}
	private int getDifferenceSub(char origin, char demand) {
		int originNumber = 0;
		int demandNumber = 0;
		for(int i = 0; i < ALPHABET_ARRAY.length; i++) {
			if(ALPHABET_ARRAY[i] == (origin)) {
				originNumber = i;
			}
			if(ALPHABET_ARRAY[i] == (demand)) {
				demandNumber = i;
			}
		}
	//	System.out.println("originNumber" + originNumber + "\tdemandNumber" + demandNumber);
		int difference = demandNumber - originNumber;
		return difference < 0 ? ALPHABET_ARRAY.length + difference : difference;
	}
	String crackCipher(String cipher, int diff) {
		char[] cipherCharArray = cipher.toCharArray();
		int difference = diff;
	//	System.out.println("difference:" + difference);
		for(int i = 0; i < cipherCharArray.length; i++) {
			if(cipherCharArray[i] == '.' || cipherCharArray[i] == ' ') {
		//		System.out.println(cipherCharArray[i] + ">>" + cipherCharArray[i]);
			} else {
				int plainCharNumber = (cipherCharArray[i] - 'a' + difference) % ALPHABET_ARRAY.length;
		//		System.out.println(cipherCharArray[i] + ">>" + ALPHABET_ARRAY[plainCharNumber]);
				cipherCharArray[i] = ALPHABET_ARRAY[plainCharNumber];
			}
		}
		
		return String.valueOf(cipherCharArray);
	}
}