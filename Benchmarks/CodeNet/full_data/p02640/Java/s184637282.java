import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String array[] = br.readLine().split(" ");
	int x = Integer.parseInt(array[0]);
	int y = Integer.parseInt(array[1]);
	String res;
	int z = y % x;
	if (z == 2 || z % 2 == 0) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
}