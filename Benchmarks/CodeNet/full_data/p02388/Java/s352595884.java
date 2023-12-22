import java.io.*;
public class Main{
    public static void main(String[] args) {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String a = new String(in.readLine());
	int x = Integer.parseInt(a);
	if (x == 1 || x == 0) {
	    System.out.println(x);
	}
	System.out.println(x*x*x);
    }
}