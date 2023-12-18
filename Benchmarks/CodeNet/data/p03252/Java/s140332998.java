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
	int len = s.length();
	for (int i=0;i<len;i++) {
	    String s1 = s.substring(i,i+1);
	    String t1 = t.substring(i,i+1);
	    int idx = i;
	    while (idx < len) {
		idx = s.indexOf(s1,idx+1);
		if (idx < 0) break;
		String t2 = t.substring(idx,idx+1);
		if (!t1.equals(t2)) {
		    System.out.println("No");
		    System.exit(0);
		}
	    }
	}
	for (int i=0;i<len;i++) {
	    String t1 = t.substring(i,i+1);
	    String s1 = s.substring(i,i+1);
	    int idx = i;
	    while (idx < len) {
		idx = t.indexOf(t1,idx+1);
		if (idx < 0) break;
		String s2 = s.substring(idx,idx+1);
		if (!s1.equals(s2)) {
		    System.out.println("No");
		    System.exit(0);
		}
	    }
	}
	System.out.println("Yes");
    }
}