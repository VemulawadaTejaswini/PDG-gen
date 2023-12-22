import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=in.nextInt(),A[]=new int[n];
		for(int i=0;i<n;i++) A[i]=in.nextInt();
		
		for(int i=n-1;i>=n/2;i--) {
			int tt=A[i];
			A[i]=A[n-i-1];
			A[n-i-1]=tt;
		}
		for(int i=0;i<n-1;i++)out.print(A[i]+" ");
		out.println(A[n-1]);
		out.flush();
	}

}
