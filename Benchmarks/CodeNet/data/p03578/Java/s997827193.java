import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] d = new int[n];
		for(int i = 0 ; i < n ; i++) d[i] = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] t = new int[m];
		for(int i = 0 ; i < m ; i++) t[i] = Integer.parseInt(sc.next());
		sc.close();
		Arrays.sort(d);
		Arrays.sort(t);
		boolean fin = true;
		boolean che = false;
		int tt = 0 , dd = 0;
		while(fin){
			if(d[dd] > t[tt]){
				fin = false;
			}else if(d[dd] < t[tt]){
				dd++;
			}else{
				dd++;
				tt++;
			}
			if(tt == m){
				che = true;
				fin = false;
			}
			if(dd == n) fin = false;
		}
		if(che) ou.print("YES\n");
		else ou.print("NO\n");
		ou.flush();
    }
}