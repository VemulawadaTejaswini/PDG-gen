import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
	    String line = Io.read();

	    int answer = 0;
	    for (int i = 0; i < line.length(); i++) {
	        if (line.charAt(i) == '+') answer++;
	        else answer--;
        }

        Io.write(answer);
    }
}

class Io {

    public static String read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();
        return line;
    }

    public static void write(int answer)
    {
        System.out.println(answer);
    }
}