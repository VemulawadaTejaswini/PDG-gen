import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        try {
	    BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
	    String line = stdReader.readLine();
	    char[] in = line.toCharArray();
	    char[] out = new char[line.length()];
	    for (int i = 0; i < line.length(); i++) {
		if (Character.isUpperCase(in[i])) {
		    out[i] = Character.toLowerCase(in[i]);
		} else if (Character.isLowerCase(in[i])) {
		    out[i] = Character.toUpperCase(in[i]);
		} else {
		    out[i] = in[i];
		}
	    }
	    for (int i = 0; i < line.length(); i++) {
		System.out.print(out[i]);
	    }
	    System.out.print("\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}