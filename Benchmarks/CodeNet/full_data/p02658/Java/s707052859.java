import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String args[]) throws IOException {
 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	long N = Long.parseLong(br.readLine());
	String array[] = br.readLine().split(" ");
	long result = 1;
	for (int i = 0; i < N; i++) {
	    result *= Long.parseLong(array[i]);
	}
 
	System.out.println(result <= 1000000000000000000L ? result : "-1");
 
    }
}