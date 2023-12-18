import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		char[][] a = new char[h + 2][w + 2];
		for(int i = 0 ; i < h + 2 ; i++) Arrays.fill(a[i] , '#');
		for(int i = 1 ; i < h + 1 ; i++){
			String s = sc.next();
			for(int j = 1 ; j < w + 1 ; j++){
				a[i][j] = s.charAt(j - 1);
			}
		}
		for(int i = 0 ; i < h + 2 ; i++){
			for(int j = 0 ; j < w + 2 ; j++){
				ou.print(a[i][j]);
			}
			ou.println();
		}
		ou.flush();
	}
}