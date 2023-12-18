import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] cou = new int[n];
		boolean[] c = new boolean[n];
		Arrays.fill(cou , 0);
		int ac = 0 , wa = 0;
		Arrays.fill(c , true);
		int p;
		String s;
		for(int i = 0 ; i < m ; i++){
			p = Integer.parseInt(sc.next()) - 1;
			s = sc.next();
			if(s.equals("WA") && c[p]) wa++;
			if(s.equals("AC") && c[p]){
				c[p] = false;
				ac++;
			}
		}
		ou.print(ac + " " + wa + "\n");
		ou.flush();
    }
}