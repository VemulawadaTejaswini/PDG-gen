import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int[] a = new int[3];
		for(int i = 0 ; i < 3 ; i++) a[i] = Integer.parseInt(sc.next());
		if(a[0] > a[1]){
			int e = a[0];
			a[0] = a[1];
			a[1] = e;
		}
		if(a[0] <= a[2] && a[2] <= a[1]) ou.print("Yes\n");
		else ou.print("No\n");
		ou.flush();
    }
}