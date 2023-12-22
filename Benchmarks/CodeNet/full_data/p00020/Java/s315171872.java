import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0020_Capitalize {
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			Capitalizer test = new Capitalizer();
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(test.convert(line));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class Capitalizer {
	private final char[] CAPITAL_ALPHABET_ARRAY;
	Capitalizer() {
		CAPITAL_ALPHABET_ARRAY = new char['Z' - 'A' + 1];	//ツ本ツ督鳴づ債配ツ療アツづ可猟環づァツつクUNICODEツづ個氾板債つゥツづァツ出ツつケツづゥツづ債つク
		char alphabetNumber = 'A';
		for(int i = 0; i < (CAPITAL_ALPHABET_ARRAY.length); i++) {
			CAPITAL_ALPHABET_ARRAY[i] = alphabetNumber;
			alphabetNumber++;
		}
	/*	for(char alphabet : CAPITAL_ALPHABET_ARRAY) {
			System.out.println(alphabet);
		}	*/
	}
	String convert(String txt) {
		char[] charArray = txt.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] == '.' || charArray[i] == ' ') {
				//do nothing
			} else {
				charArray[i] = CAPITAL_ALPHABET_ARRAY[charArray[i] - 'a'];
			}
		}
		
		return String.valueOf(charArray);
	}
}