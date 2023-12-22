import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
		try {
			line = br.readLine();
		} catch (IOException e) {
			System.err.println("The input is missing. " + e.getMessage());
			return;
		}

		int s;
        try {
        	s = Integer.parseInt(line);
        } catch(Throwable e) {
			System.err.println("The input is in an illegal form. " + line);
			return;
        }

        StringBuilder b = new StringBuilder();
        b.append(s / 3600).append(':');

        s %= 3600;
        b.append(s / 60).append(':');

        s %= 60;
        b.append(s);

        System.out.println(b.toString());
    }
}