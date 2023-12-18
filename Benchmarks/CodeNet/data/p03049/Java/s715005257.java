import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int a = 0 , b = 0;
		int yono = 0;
		for(int i = 0 ; i < n ; i++){
			String s = sc.next();
			if(s.charAt(0) == 'B') b++;
			if(s.charAt(s.length() - 1) == 'A') a++;
			for(int ii = 0 ; ii < s.length() - 1 ; ii++){
				if(s.charAt(ii) == 'A' && s.charAt(ii + 1) == 'B') yono++;
			}
		}
		yono += Math.min(a , b);
		if(a == b) yono--;
		ou.print(yono + "\n");
		ou.flush();
    }
}
