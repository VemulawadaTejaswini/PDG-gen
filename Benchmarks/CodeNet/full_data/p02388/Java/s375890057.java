impmport java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int input = Integer.parseInt( reader.readLine() );
	System.out.println((int) Math.pow(input, 3));
        }
    }
}