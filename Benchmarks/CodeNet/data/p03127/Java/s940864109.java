import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		long g = a[0];
		long aa , ab , am;
		for(int i = 1 ; i < n ; i++){
			aa = g;
			ab = a[i];
			am = aa % ab;
			while(ab != 0){
				am = aa % ab;
				aa = ab;
				ab = am;
			}
			g = aa;
		}
		ou.println(g);
		ou.flush();
	}
}