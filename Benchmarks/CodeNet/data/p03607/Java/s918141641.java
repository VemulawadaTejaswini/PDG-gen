import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		Arrays.sort(a);
		int yono = 0;
		int k = 0;
		for(int i = 1 ; i < n ; i++){
			if(a[i - 1] == a[0]) k++;
			else{
				yono += k % 2;
				k = 1;
			}
		}
		k--;
		yono += k % 2;
		ou.println(yono);
		ou.flush();
	}
}