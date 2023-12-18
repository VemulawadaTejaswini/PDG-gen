import java.util.*;
import java.lang.*; 
import java.io.*;
import java.math.*;

public class taskA {

  public static void main(String[] arguments) {

  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	StringTokenizer st = new StringTokenizer(br.readLine());

	int n= Integer.parseInt(st.nextToken());
	int k = Integer.parseInt(st.nextToken());
	int total =0;

	if( n%2 == 0) {
		total = n/2;
	} else {
		total = (n+1)/2;
	}

	if(k <= total) {
		System.out.println("YES");
	} else {
		System.out.println("NO");
	}
  }
}