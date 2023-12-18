import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main	 {
    public static void main(String[] args) throws IOException {
        	Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	String s = sc.next();
        	int red =0, green =0, blue =0;
        	for(int i=1;i<=n;i++) {
        		if(s.charAt(i-1)=='R')
        			red++;
        		else if(s.charAt(i-1)=='G')
        			green++;
        		else
        			blue++;
        	}
        	long res=red*green*blue;
        	for(int i=0;i<n;i++) {
        		char a = s.charAt(i);
        		for(int j=i+1;j<n;j++) {
        			char b = s.charAt(j);
        			int k = j + (j-i);
        			if(k<n) {
        				char c = s.charAt(k);
            			if((a=='R' && b=='G' && c=='B') || (a=='R' && b=='B' && c=='G') || (a=='G' && b=='R' && c=='B') || (a=='G' && b=='B' && c=='R') || (a=='B' && b=='G' && c=='R') || (a=='B' && b=='R' && c=='G'))
            				res--;
        			}			
        		}
        	}
        	System.out.println(res);
    }
}
