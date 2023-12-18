import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
	String s = "";
	String t = "";
	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    s = br.readLine();
	    t = br.readLine();
	} catch(IOException e) {
	    e.printStackTrace();
	}
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	int len = s.length();
	for (int i=0;i<26;i++) {
	    String ab = alphabet.substring(i,i+1);
	    int idx = -1;
	    idx = s.indexOf(ab,idx+1);
	    if (idx >= 0) {
		String t1 = t.substring(idx,idx+1);
		while (idx < len) {
		    idx = s.indexOf(ab,idx+1);
		    if (idx < 0) break;
		    String t2 = t.substring(idx,idx+1);
		    if (!t1.equals(t2)) {
			System.out.println("No");
			System.exit(0);
		    }
		}
	    }
	    idx = -1;
	    idx = t.indexOf(ab,idx+1);
	    if (idx >= 0) {
		String s1 = s.substring(idx,idx+1);
		while (idx < len) {
		    idx = t.indexOf(ab,idx+1);
		    if (idx < 0) break;
		    String s2 = s.substring(idx,idx+1);
		    if (!s1.equals(s2)) {
			System.out.println("No");
			System.exit(0);
		    }
		}
	    }
	}
	System.out.println("Yes");
    }
}