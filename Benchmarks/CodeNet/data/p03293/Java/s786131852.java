import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		sc.close();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean yono = true;
		int yo = 0;
		for(char i : a){
			if(b[yo] != i) yono = false;
			yo++;
		}
		if(yono) ou.println("Yes");
		else ou.println("No");
		ou.flush();
	}
}