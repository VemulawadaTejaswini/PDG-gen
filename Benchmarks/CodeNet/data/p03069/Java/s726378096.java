import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args)throws IOException{
    //BufferedReader br = new BufferedReader(System.in);
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    
    int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		int sum = 0;
		for(int i=0; i<n; i++)
			if(s[i] == '#')
				sum++;
		
		out.println(Math.min(sum, n-sum));
    
    out.flush();
  }
}