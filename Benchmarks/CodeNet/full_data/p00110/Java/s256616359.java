import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();

			if(str == null){
				break;
			}
			
			String[] tmpArray = str.split("\\+");
			String str1 = tmpArray[0];
			tmpArray = tmpArray[1].split("=");
			String str2 = tmpArray[0];
			String str3 = tmpArray[1];
			
			//System.out.println(str1+" "+str2+" "+str3);
			//?????????
			boolean solve = false;
			for(int i = 0; i < 9 ; i++){
				int a = replaceXtoNumber(str1, i);
				int b = replaceXtoNumber(str2, i);
				int c = replaceXtoNumber(str3, i);
				
				if(a >= 0 && b >= 0 && c >= 0){
					if(a + b == c){
						System.out.println(i);
						solve = true;
						break;
					}
				}
			}
			if(!solve){
				System.out.println("NA");
			}
		}
	}
	
	static int replaceXtoNumber(String str, int n){
		if(str.charAt(0) == 'X' && n == 0){
			return -1;
		}
		String tmp = new String(str);
		
		tmp = tmp.replace('X', (char) ('0'+n));
		//System.out.println(tmp);
		
		return Integer.parseInt(tmp);
	}

}