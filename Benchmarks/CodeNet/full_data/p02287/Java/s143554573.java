import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt(),A[]=new int[n+1];
		int sent=1;char childs=0;
		
		A[1]=Integer.parseInt(in.next());
		for(int i=1;i<n;i++) {
			int key=Integer.parseInt(in.next());
			
			if(childs==0)A[sent*2]=key;
			else A[sent*2+1]=key;
			childs++;
			
			if(childs==2) {
				sent++;
				childs=0;
			}
		}
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=1;i<=n;i++) {
			out.printf("node %d: key = %d,",i,A[i]);
			if(i!=1)out.printf(" parent key = %d,", A[i/2]);
			if(i*2<=n)out.printf(" left key = %d,", A[i*2]);
			if(i*2+1<=n)out.printf(" right key = %d,", A[i*2+1]);
			out.println();
		}
		out.flush();
	}

}

