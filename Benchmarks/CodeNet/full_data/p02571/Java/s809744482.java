import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		String s = sc.next();
		String t = sc.next();
		sc.close();
		char[] q = new char[s.length()];
		char[] a = new char[t.length()];
		int yono = 10000;
		for(int i = 0 ; i < s.length() ; i++) q[i] = s.charAt(i);
		for(int i = 0 ; i < t.length() ; i++) a[i] = t.charAt(i);
		for(int i = 0 ; i < s.length() - t.length() + 1 ; i++){
			int ebi = 0;
			for(int j = 0 ; j < t.length() ; j++){
				if(q[i + j] != a[j]) ebi++;
			}
			yono = Math.min(yono , ebi);
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}