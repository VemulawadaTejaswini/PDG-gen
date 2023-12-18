import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap hs = new HashMap();
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next()) - 1;
		int m = Integer.parseInt(sc.next());
		int[][] s = new int[2][m];
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ; j < 2 ; j++){
				s[j][i] = Integer.parseInt(sc.next());
			}
			s[0][i]--;
			s[1][i] += 48;
		}
		sc.close();
		boolean ebishu = true;
		int k = (int)Math.pow(10 , n);
		while(ebishu){
			String ss = String.valueOf(k);
			boolean ebi = true;
			for(int i = 0 ; i < m && ebi ; i++){
				if((int)ss.charAt(s[0][i]) != s[1][i]) ebi = false;
			}
			if(ebi){
				ou.print(k);
				ebishu = false;
			}
			k++;
			if(k >= Math.pow(10 , n + 1) && ebishu){
				ou.print(-1);
				ebishu = false;
			}
		}
		ou.print("\n");
		ou.flush();
	}
}