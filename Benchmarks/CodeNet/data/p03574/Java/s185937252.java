import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int h = parseInt(sc.next());
		int w = parseInt(sc.next());
		char[][] s = new char[h][w];
		for(i=0;i<h;i++) {
			s[i] = sc.next().toCharArray();
		}
		sc.close();
		char[][] a = new char[h+2][w+2];
		for(i=1;i< h+1;i++) {
			for (j = 1; j < w+1; j++) {
				a[i][j] = '0';
			}
		}
		for(i=1;i< h+1;i++) {
			for (j = 1; j < w+1; j++) {
				if(s[i-1][j-1]=='#') {
					a[i-1][j-1]++;
					a[i-1][j  ]++;
					a[i-1][j+1]++;
					a[i  ][j-1]++;
					a[i  ][j+1]++;
					a[i+1][j-1]++;
					a[i+1][j  ]++;
					a[i+1][j+1]++;
				}
			}
		}
		PrintWriter pw = new PrintWriter(out);
		for(i=1;i< h+1;i++) {
			for (j = 1; j < w+1; j++) {
				if(s[i-1][j-1]=='#') {
					pw.print('#');
				} else {
					pw.print(a[i][j]);
				}
			}
			pw.println();
		}
		pw.flush();
	}
}
