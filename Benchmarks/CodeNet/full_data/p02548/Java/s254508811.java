import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next()) - 1;
		sc.close();
		long yono = 0;
		for(int i = 1 ; i <= n ; i++){
			yono += n / i;
		}
		ou.println(yono);
		ou.flush();
	}
}