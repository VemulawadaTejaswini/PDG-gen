//????????????????±???????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			int sum = 0;
			
			String str = br.readLine();	
			
			int inputNum = Integer.parseInt(str);
			
			if(inputNum == 0) {
				break;
			}
			
			for(int i=0; i<str.length(); i++) {
				String strNum = String.valueOf(str.charAt(i));
				int num = Integer.parseInt(strNum);
				sum = sum + num;
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb.toString());
	}

}