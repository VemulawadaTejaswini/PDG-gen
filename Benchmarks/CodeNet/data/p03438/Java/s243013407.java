import java.io.*;
import java.util.*;

public class b {
	
	public static void main(String[] args) throws Exception {
		int N;
		int posi=0;
		int nega=0;
		int sum=0;
		int x=0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = new String(in.readLine());
		N = Integer.parseInt(s);
		
		in = new BufferedReader(new InputStreamReader(System.in));
		s = new String(in.readLine());
		String[] temp = s.split(" ",0);
		
		for(int i=0; i<temp.length; i++){
			a.add( Integer.parseInt(temp[i]) );
		}
		
		in = new BufferedReader(new InputStreamReader(System.in));
		s = new String(in.readLine());
		temp = s.split(" ",0);
		
		for(int i=0; i<temp.length; i++){
			b.add( Integer.parseInt(temp[i]) );
		}
		
		for(int i=0; i<N; i++){
			x = a.get(i) - b.get(i);
			if( x >= 0 ) posi += x;
			else         nega -= x;
		}
		
		x = posi - nega/2 ;
		if( x < 0 ) System.out.println("Yes");
		else        System.out.println("No");
	}
}