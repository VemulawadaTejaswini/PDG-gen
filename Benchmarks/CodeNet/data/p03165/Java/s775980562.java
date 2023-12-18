import java.util.Scanner;
import java.util.*;
public class Main {



public static int LCS_DP(String s , String t) {
		int m = s.length();
		int n = t.length();
		int storage[][] = new int[m+1][n+1];
		storage[0][0] = 0;
		for (int i=0; i<=n; i++) {
			storage[0][i] = 0;
		}
		for (int j=0; j<=m; j++) {
			storage[j][0] = 0;
		}
		for (int i=1; i<=m;i++) {
			for (int j =1; j<=n;j++) {
				if(s.charAt(m-i) == t.charAt(m-j)) {
					storage[i][j] = 1+storage[i-1][j-1];
				}else {
					storage[i][j] = Math.max(storage[i][j-1], storage[i-1][j]);
				}
			}
		}
		return storage[m][n];
	}

public static void main(String[] args) {
		Scanner s= new Scanner(System.in);   
  
  		String s = s.next();
		String t = s.next();		
		System.out.println(LCS_DP(s,t));
	}
}