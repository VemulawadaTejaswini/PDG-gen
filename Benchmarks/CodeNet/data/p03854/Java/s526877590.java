import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuffer sb = new StringBuffer(str);
		str = sb.reverse().toString();
		
		
		String str2[] = new String[2];
		str2[0] = str;
		while( !(str2[0]==null || str2[0].equals("")) ){
			str2 = strCheck(str2[0]);
		}
		
		if(str2[0]==null){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
		
	}

	private static String[] strCheck(String str) {
		String[] str2 = new String[2];

		if (str.length() >= 5) {
			String five = str.substring(0, 5);
			switch (five) {
			case "maerd":
				str2[0] = str.substring(5, str.length());
				str2[1] = "1";
				return str2;
			case "esare":
				str2[0] = str.substring(5, str.length());
				str2[1] = "1";
				return str2;
			}
		}

		if (str.length() >= 6) {
			String six = str.substring(0, 6);
			if (six.equals("resare")) {
				str2[0] = str.substring(6, str.length());
				str2[1] = "1";
				return str2;
			}
		}

		if (str.length() >= 7) {
			String seven = str.substring(0, 7);
			if (seven.equals("remaerd")) {
				str2[0] = str.substring(7, str.length());
				str2[1] = "1";
				return str2;
			}
		}

		str2[0] = null;
		str2[1] = "0";
		return str2;
	}

}
