import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main implements Runnable {

    private int[] s;
    
    public static void main(String[] args) {
	Main m = new Main();
	m.run();
    }

    private void set() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    s = Arrays.stream(br.readLine().split("")).mapToInt(this::convert).toArray();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    @Override
    public void run() {
	set();
	long n = 0;
	long m = 0;
	for (int i=0;i<s.length;i++) {
	    if (s[i] == 0) {
		m++;
	    } else {
		n += m;
	    }
	}
	System.out.println(n);
    }

    private int convert(String t) {
	if (t.equals("B")) return 0;
	if (t.equals("W")) return 1;
	return -1;
    }
}