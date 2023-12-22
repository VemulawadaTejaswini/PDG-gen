import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] a){

		String str;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(null != ( str = bf.readLine() )){
				char[] cArr = str.toCharArray();
				int len = cArr.length;
				for(int i = 0; i < len / 2; i++){
					char tmp = cArr[i];
					cArr[i] = cArr[len - i - 1];
					cArr[len - i - 1] = tmp;
				}
				for(char c : cArr){
					System.out.print(c);
				}
				System.out.println("");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}
	}

}