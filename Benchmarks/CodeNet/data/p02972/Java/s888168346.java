import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		boolean[] a = new boolean[n];
		Arrays.fill(a , false);
		for(int i = 0 ; i < n ; i++) if(Integer.parseInt(sc.next()) == 1) a[i] = true;
		sc.close();
		boolean[] che = new boolean[n];
		Arrays.fill(che , false);
		int cou;
		for(int i = n - 1 ; i >= 0 ; i--){
			cou = 0;
			for(int j = i ; j < n ; j += i + 1){
				if(che[j]) cou++;
			}
			if(a[i]) cou++;
			if(cou % 2 == 1) che[i] = true;
		}
		int yono = 0;
		for(int i = 0 ; i < n ; i++) if(che[i]) yono++;
		ou.println(yono);
		int c = yono;
		yono = 0;
		for(int i = 0 ; che[i] && i < n ; i++){
			if(yono == 0) ou.print(i + 1);
			else ou.print(" " + (1 + i));
		}
		if(c != 0) ou.println();
		ou.flush();
	}
}