import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int length = Integer.parseInt(br.readLine());
	String strArray[] = br.readLine().split(" ");
	String result = "YES";
	for (int i = 0; i < length - 2; i++) {
	    for (int j = i + 1; j < length - 1;) {
		if (strArray[i].equals(strArray[j])) {
		    result = "NO";
		    break;
		} else {
		    ++j;
		}
	    }
	}
	System.out.println(result);
    }
}
