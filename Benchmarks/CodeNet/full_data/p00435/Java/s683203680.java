import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		while(true){
//			String input = br.readLine();
//			
//			if(input == null){
//				break;
//			}
//			
//			System.out.println(Solver.solve(input));
//		}
		
		System.out.println(Solver.solve(br.readLine(), 3));
	}

}

class Solver {
	public static String solve(String str, int offset){
		char[] carray = str.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < carray.length ; i++){
			if(carray[i] <= 'C'){
				sb.append((char)('Z' - ('C' - carray[i])));
			}
			else {
				sb.append((char)(carray[i] - 3));
			}
		}
		
		return sb.toString();
	}
	
	public static String solve(String str){
		char[] inputCharArray = str.toCharArray();
		
		String newString = null;
		for(int i = 0; i < 26; i++){
			newString = makeNewString(inputCharArray, i);
			
			//System.out.println(newString);
			if(newString.contains("this ") || newString.contains("that ") || newString.contains("the ")
					|| newString.contains("this.") || newString.contains("that.") || newString.contains("the.")){
				break;
			}
		}
		
		return newString;
	}
	
	private static String makeNewString(char[] array, int n){
		char [] tmpArray = new char[array.length];
		for(int i = 0; i < array.length ;i++){
			if(Character.isAlphabetic(array[i])){
				tmpArray[i] = (char) (array[i] + n);
				if(tmpArray[i] > 'z'){
					tmpArray[i] -= 26;
				}
			}
			else {
				tmpArray[i] = array[i];
			}
		}
		
		return new String(tmpArray);
	}
}