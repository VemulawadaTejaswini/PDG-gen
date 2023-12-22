import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next()),A[]=new int[n];
		for(int i=0;i<n;i++)A[i]=Integer.parseInt(in.next());
		
		int q=Integer.parseInt(in.next());
		for(int i=0;i<q;i++) {
			int b=Integer.parseInt(in.next()),e=Integer.parseInt(in.next());
			reverse(A,b,e-1);
		}
		for(int i=0;i<n-1;i++)System.out.print(A[i]+" ");
		System.out.println(A[n-1]);
	}
	
	static void reverse(int A[],int b,int e) {
		for(int i=0;i<(int)((e-b)/2);i++) {
			int tt=A[e-i];
			A[e-i]=A[b+i];
			A[b+i]=tt;
		}
	}

}
