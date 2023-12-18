import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		sc.close();
		int x = 0;
		int yono = 0;
		for(int i = 0 ; i < n ; i++){
			if(s.charAt(i) == 'I') x++;
			else x--;
			yono = Math.max(yono , x);
		}
		ou.println(yono);
		ou.flush();
    }
}