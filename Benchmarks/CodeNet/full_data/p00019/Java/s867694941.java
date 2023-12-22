import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;

		try {
			if(null != (tmpString = bf.readLine())){
				int ans = qa(Integer.parseInt(tmpString));
				System.out.println(ans);
			}
		} catch (IOException e) {
		}
	}

	private static int qa(int number){
		if(number == 1)return number;
		return number * qa(number - 1);
	}
}