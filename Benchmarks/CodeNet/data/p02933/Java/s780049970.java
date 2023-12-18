import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int a = Integer.parseInt(br.readLine());
	String s = br.readLine();
	if (a >= 3200)
	    System.out.println(s);
	else
	    System.out.println("red");
    }
}