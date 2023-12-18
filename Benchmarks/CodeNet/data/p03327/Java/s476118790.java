import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		sc.close();
		String s = "C";
		if(n >= 1000) s = "D";
		ou.println("AB" + s);
		ou.flush();
	}
}