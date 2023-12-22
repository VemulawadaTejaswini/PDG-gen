import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int i = Integer.parseInt(sc.next());
		if(i == 0) ou.println(1);
		else ou.println(0);
		ou.flush();
	}
}