import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int[] a = new int[3];
		for(int i = 0 ; i < 3 ; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		Arrays.sort(a);
		int yono = 3;
		if(a[0] == a[1]) yono--;
		if(a[1] == a[2]) yono--;
		ou.println(yono);
		ou.flush();
	}
}