import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] h = new int[n];
		for(int i = 0 ; i < n ; i++) h[i] = Integer.parseInt(sc.next());
		sc.close();
		Arrays.sort(h);
		int yono = (int)Math.pow(10 , 9);
		for(int i = 0 ; i <= n - k ; i++) yono = Math.min(yono , h[i + k - 1] - h[i]);
		ou.println(yono);
		ou.flush();
	}
}