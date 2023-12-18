import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int a = Integer.parseInt(sc.next());
		if(a > Integer.parseInt(sc.next())) a--;
		ou.println(a);
		ou.flush();
	}
}