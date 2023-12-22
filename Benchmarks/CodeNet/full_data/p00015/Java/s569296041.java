import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			if(str1.length() > 80 || str2.length() > 80){
				System.out.println("overflow");
				continue;
			}
			
			//?¨????????\????????????????????????????????????¢??????
			char[] str1Rev = reverseString(str1);
			char[] str2Rev = reverseString(str2);
			
			//??????????¶????????????????
			int[] result = new int[101];
			Arrays.fill(result, 0);
			
			int a, b, c = 0;
			boolean of = false;
			for(int j = 0; j < str1.length() || j < str2.length() || c != 0; j++){
				if(j < str1.length()){
					a = Character.digit(str1Rev[j], 10);
				}
				else {
					a = 0;
				}
				
				if(j < str2.length()){
					b = Character.digit(str2Rev[j], 10);
				}
				else {
					b = 0;
				}	
				
				if(j >= 80 && a+b+c != 0){
					of = true;
					break;
				}
				result[j] = (a+b+c)%10;
				c = (a+b+c)/10;
			}
			if(of){
				System.out.println("overflow");
			}
			
			//???????????????
			boolean printable = false;
			for(int j = result.length - 1; j >= 0; j--){
				if(printable == false && result[j] != 0){
					printable = true;
				}
				
				if(printable){
					System.out.print(result[j]);
				}
			}
			System.out.println();
		}
	}
	
	static char[] reverseString(String str){
		char[] result = new char[str.length()];
		for(int i = 0; i < str.length(); i++){
			result[i] = str.charAt(str.length() - 1 - i);
		}
		
		return result;
	}

}