import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while(!(str = br.readLine()).startsWith("0")){
			int num = 0;
			for(char c : str.toCharArray()){
				num += Character.getNumericValue(c);
			}
			System.out.println(num);
		}
	}
}