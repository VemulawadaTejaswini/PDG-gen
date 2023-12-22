import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
		
		int sumOfIndex = 0;
		while(true){
			int index = str1.indexOf(str2);
			
			if(index == -1){
				break;
			}
			
			sumOfIndex += index;
			System.out.println(sumOfIndex);
			str1 = str1.substring(index + 1, str1.length());
			sumOfIndex++;
			if(str1.length() == 0){
				break;
			}
			//System.out.println(str1);
		}
	}

}