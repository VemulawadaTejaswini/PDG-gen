import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int yono = 0;
		for(int i = 0 ; i < n ; i++){
			if(i + 1 != Integer.parseInt(sc.next())) yono++;
		}
		if(yono <= 2) ou.println("YES");
		else ou.println("NO");
		ou.flush();
	}
}