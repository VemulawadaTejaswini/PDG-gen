import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] tmpArray = input.split(" ");
		int a = Integer.parseInt(tmpArray[0]);
		int b = Integer.parseInt(tmpArray[1]);
		
		String posStr = br.readLine();
		
		String ptnStr = "\\d{"+a+"}-\\d{"+b+"}";
		
		if(Pattern.matches(ptnStr, posStr)){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
//		String[] postal = posStr.split("-", -1);
////		Pattern p = Pattern.compile("[\\d]++");
////		Matcher m = p.matcher(arg0)
//		boolean available = false;
//		if(posStr.charAt(a) != '-'){
//			available = false;
//		}
//		else if(postal.length != 2){
//			available = false;
//		}
//		
////		else if(!postal[1].equals("-")){
////			available = false;
////		}
//		else if(postal[0].length() == a && Pattern.matches("\\d++", postal[0])
//			&& postal[1].length() == b && Pattern.matches("\\d++", postal[1])){
//			available = true;
//		}
//		
//		if(available){
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
	}

}
