
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
		String result = "";
		while(true){
			String[] s = br.readLine().split(" ");			
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			if(a==0 && b==0){break;}
			if(a < b){
				result += a +" "+b+"\n";
			}else{
				result += b +" "+a+"\n";
			}
		}
		System.out.print(result);

	}

}