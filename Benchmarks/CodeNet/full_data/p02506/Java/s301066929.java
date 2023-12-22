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
			int sl;
			while(!(s = br.readLine()).equals("END_OF_TEXT")) {
				i = 0;
				sl = s.length();
				while(i < sl) {
					if(s.charAt(i) == ' ') {
						if(judge(W, l))
							count++;
						l = "";
						while(i < sl-1 && s.charAt(++i) == ' ');
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
	public static boolean judge(String w, String l) {
		int wl = w.length(), ll = l.length();
		if(wl != ll)
			return false;
		int i = 0;
		while(i < wl) {
			if(!(w.charAt(i) == l.charAt(i) || w.charAt(i)-'a'+'A' == l.charAt(i)))
				return false;
			i++;
		}
		return true;
	}
}