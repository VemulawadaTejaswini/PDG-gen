import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	 int n=s.nextInt();
	 
	 char[] col=s.next().toCharArray();
	 int count=0;
	int si=0;
	int ei=n-1;
	while(si<ei) {
		if(col[si]=='W'&&col[ei]=='R') {
			col[si]='R';
			col[ei]='W';
			count++;
		}
		else if(col[si]=='R') {
			si++;
		}
		else if(col[ei]=='W') {
			ei--;
		}
		
	}
	 System.out.println(count);
	

	
	

}}
