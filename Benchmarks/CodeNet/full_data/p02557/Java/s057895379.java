
import java.io.*;
import java.util.*;

import learnjava.test6.Pair;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=Integer.parseInt(sc.readLine());
		int[] a=new int[n];
		int[] b=new int[n];
		String[] ia=sc.readLine().split(" ");
		String[] ib=sc.readLine().split(" ");
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(ia[i]);
			b[i]=Integer.parseInt(ib[n-i-1]);
		}
		boolean poss=true;
		for(int i=0;i<n;i++) {
			if(a[i]==b[i]) {
				out.print("No");
				poss=false;
				break;
			}
		}
		if(poss) {
		out.println("Yes");
		for(int e:b) out.print(e+" ");
		}
		
		out.flush();
		out.close();
		
	}	

}

