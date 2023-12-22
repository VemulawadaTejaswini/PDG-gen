import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
for(;sc.hasNext();){
String s=sc.next();
String t=sc.next();
System.out.println(lcs(s,t));
}
}
static 	int lcs(String s, String t){
		int m=s.length(), n=t.length();
		int[][] d=new int[n+1][m+1];
		for(int j=1; j<=n; j++){
			for(int i=1; i<=m; i++){
				if(s.charAt(i-1)==t.charAt(j-1))
					d[j][i]=d[j-1][i-1]+1;
				d[j][i]=Math.max(d[j][i-1], d[j-1][i]);
			}
		}
		return d[n][m];
	}

}