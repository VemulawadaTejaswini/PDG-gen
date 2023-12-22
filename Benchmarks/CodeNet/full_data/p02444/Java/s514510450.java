import java.util.*;

public class Main {
	
	static int A[],B[];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next());
		A=new int[n];
		for(int i=0;i<n;i++)A[i]=Integer.parseInt(in.next());
		
		int q=Integer.parseInt(in.next());
		for(int i=0;i<q;i++) {
			B=A.clone();
			int begin=Integer.parseInt(in.next()),middle=Integer.parseInt(in.next()),end=Integer.parseInt(in.next());
			rotate(begin,middle,end);
			A=B.clone();
		}
		for(int i=0;i<n-1;i++)System.out.print(B[i]+" ");
		System.out.println(B[n-1]);
	}
	
	static void rotate(int begin,int middle,int end) {
		int eb=end-begin,em=end-middle;
		for(int k=0;k<eb;k++) {
			int dist=begin+((k+em)%eb);
			//System.out.println((k+begin)+":"+A[k+begin]+"=>"+dist);
			B[dist]=A[k+begin];
		}
	}

}

