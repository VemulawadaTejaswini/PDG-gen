import java.io.*;
import java.util.regex.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		Pattern p = Pattern.compile("\\d++");
		String str = new String();
		while(true) {
			String s = r.readLine();
			str += s;
			if(s == null) break;
		}
		if(!p.matcher(str).matches()) {
			System.out.println("0");
		} else {
			String[] m = p.split(str);
			for(String s : m) {
				str = str.replace(s, " ");
			}
			m = str.split(" ");
			int sum = 0;
			for(String s : m) {
				if(s.length() > 0) {
					sum += Integer.valueOf(s);
				}
			}
			System.out.println(sum);
		}
	}
}