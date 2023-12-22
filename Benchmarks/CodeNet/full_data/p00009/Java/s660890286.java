import java.io.*;

public class Main {
    public static void main(String[] args) {
	  boolean [] p;
	  p = new boolean[101000];
	prime(p);
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line;
	    while((line = reader.readLine()) != null) {
		int n = Integer.parseInt(line);
		int ans = 0;
		for(int i = 2; i <= n; i++) {
		    if(p[i]) ans++;
		}
		System.out.println(ans);
	    }
	} catch (IOException e) {
	    System.out.println(e);
	}
    }

    public static void prime(boolean p[]) {
	for(int i = 0; i < p.length; i++) p[i] = true;
	p[0] = false;
	p[1] = false;
	for(int i = 0; i < p.length; i++) {
	    if(p[i]) {
		for(int j = 2; i*j < p.length; j++) {
		    p[i*j] = false;
		}
	    }
	}
    }
}