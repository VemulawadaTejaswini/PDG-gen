import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		sc.close();
		long yono = 1;
		for(int i = 2 ; i <= n ; i++){
			yono *= i;
			yono %= (int)Math.pow(10 , 9) + 7;
		}
		ou.println(yono);
		ou.flush();
	}
}