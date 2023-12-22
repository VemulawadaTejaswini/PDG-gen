import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int MAX_RAW = 6;
	static final int MAX_LINE = 5;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while((input = br.readLine()) != null){
			System.out.println(encode(input));
		}
	}

	public static String encode(String input){
		if(input.length() % 2 != 0)	return "NA";
		
		StringBuffer sbuf = new StringBuffer();
		for(int i = 0; i < input.length(); i += 2){
			//数字を英字に変換
			int raw = Integer.parseInt(input.substring(i, i + 1));
			int line = Integer.parseInt(input.substring(i + 1, i + 2));
			if(raw > MAX_RAW|| line > MAX_LINE)	return "NA";
			int c = 'a' + (raw - 1) * 5 + line - 1;
			if(c == 'z' + 1)	c = '.';
			else if(c == 'z' + 2)	c = '?';
			else if(c == 'z' + 3)	c = '!';
			else if(c == 'z' + 4)	c = ' ';
			sbuf.append((char)c);
		}
		return sbuf.toString();
	}
}