import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			String s, W, l = "";
			int i, count = 0;
			W = br.readLine();
			W = W.toLowerCase();
			while(!(s = br.readLine()).equals("END_OF_TEXT")) {
				i = 0;
				while(i < s.length()) {
					if(s.charAt(i) == ' ') {
						if(judge(W, l))
							count++;
						l = "";
						i++;
					}
					l+=String.valueOf(s.charAt(i));
					i++;
				}
				if(judge(W, l))
					count++;
				l = "";
			}
			System.out.println(count);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	public static boolean judge(String s, String l) {
		int i = 0;
		while(i < s.length()) {
			if(!(s.charAt(i) == l.charAt(i) || s.charAt(i)-'a'+'A' == l.charAt(i)))
				return false;
			i++;
		}
		return true;
	}
}