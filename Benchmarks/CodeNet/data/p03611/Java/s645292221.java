import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] q = new int[(int)Math.pow(10 , 5) + 2];
		Arrays.fill(q , 0);
		int a;
		for(int i = 0 ; i < n ; i++){
			a = Integer.parseInt(sc.next());
			q[a]++;
			q[a + 1]++;
			q[a + 2]++;
		}
		Arrays.sort(q);
		ou.println(q[(int)Math.pow(10 , 5) + 1]);
		ou.flush();
	}
}