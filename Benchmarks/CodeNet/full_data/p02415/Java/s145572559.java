import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class toggingcases {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			StringBuilder b1 = new StringBuilder(str);

			for(int i=0; i < str.length(); i++) {

				if( Character.isUpperCase(str.charAt(i))){ //Upper
				    b1.replace(i,i+1,String.valueOf(str.charAt(i)).toLowerCase() );
				}
				else {//Lower
				   b1.replace(i,i+1,String.valueOf(str.charAt(i)).toUpperCase() );
				   //System.out.println(str.charAt(i));
				}
			}
			String t = b1.toString();
			System.out.println(t);

		}catch(IOException e) {
			System.out.println("Exception : " + e);
		}
	}
}
