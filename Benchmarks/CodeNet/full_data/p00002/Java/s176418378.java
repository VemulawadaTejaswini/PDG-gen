import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str="";
		while(true){
			try {
				str = br.readLine();
			}catch (Exception e) {

			}
			if(str == null){
				break;
			}

			String moji[] = str.split(" ");
			int sum = Integer.parseInt(moji[0]) + Integer.parseInt(moji[1]);

			System.out.println(Integer.toString(sum).length());
		}
	}
}