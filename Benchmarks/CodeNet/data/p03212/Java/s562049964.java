import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    private int n;
    private int len;
    private int ans = 0;

    public static void main(String[] args) {
    	Main sff = new Main();
	sff.answer();
    }

    public void answer() {
	set();
	if (len < 3) {
	    System.out.println(0);
	    System.exit(0);
	}
	StringBuilder sb = new StringBuilder();
	joint(sb);
	System.out.println(ans);
    }

    private void joint(StringBuilder sb) {
	String s = sb.toString();
	if (s.length() <= len && s.length() > 0) {
	    if (Integer.parseInt(s) <= n && s.indexOf("7") >= 0
		&& s.indexOf("5") >= 0 && s.indexOf("3") >= 0) ans++;
	} else if (s.length() > len) {
	    return;
	}
	StringBuilder sb7 = new StringBuilder(s);
	joint(sb7.append("7"));
	StringBuilder sb5 = new StringBuilder(s);
	joint(sb5.append("5"));
	StringBuilder sb3 = new StringBuilder(s);
	joint(sb3.append("3"));
    }

    private void set() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    String s = br.readLine();
	    n = Integer.parseInt(s);
	    len = s.length();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }   
}