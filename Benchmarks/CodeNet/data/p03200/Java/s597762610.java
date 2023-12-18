import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main implements Runnable {

    private String[] s;
    
    public static void main(String[] args) {
	Main m = new Main();
	m.run();
    }

    private void set() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    s = br.readLine().split("");
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    @Override
    public void run() {
	set();
	long n = 0;
	long m = 0;
	while (true) {
	    for (int i=0;i<s.length-1;i++) {
		if (s[i].equals("B") && s[i+1].equals("W")) {
		    s[i] = "W";
		    s[i+1] = "B";
		    n++;
		}
	    }
	    if (m == n) break;
	    m = n;
	}
	System.out.println(n);
    }
}