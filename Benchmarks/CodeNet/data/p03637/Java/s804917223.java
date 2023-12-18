import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int a = 0 , b = 0 , c = 0 , q;
		for(int i = 0 ; i < n ; i++){
			q = Integer.parseInt(sc.next()) % 4;
			if(q == 0) c++;
			else if(q == 2) b++;
			else a++;
		}
		sc.close();
		String s = "Yes";
		if(b != 0) a++;
		if(a > c + 1) s = "No";
		ou.println(s);
		ou.flush();
    }
}