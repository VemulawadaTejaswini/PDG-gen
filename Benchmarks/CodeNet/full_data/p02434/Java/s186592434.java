import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=Integer.parseInt(in.next()),q=Integer.parseInt(in.next());
		List<Integer> A[]=new ArrayList[n];
		for(int i=0;i<n;i++)A[i]=new ArrayList<Integer>();
		for(int i=0;i<q;i++){
			int query=Integer.parseInt(in.next());
			
			switch(query){
			case 0:
				int t1=Integer.parseInt(in.next()),x=Integer.parseInt(in.next());
				A[t1].add(x);
				break;
				
			case 1:
				int t2=Integer.parseInt(in.next());
				if(A[t2].isEmpty())out.println();
				else{
					for(int j=0;j<A[t2].size()-1;j++)out.print(A[t2].get(j)+" ");
					out.println(A[t2].get(A[t2].size()-1));
				}
				break;
				
			case 2:
				int t3=Integer.parseInt(in.next());
				A[t3].clear();
				break;
			}
		}
		out.flush();
	}

}

