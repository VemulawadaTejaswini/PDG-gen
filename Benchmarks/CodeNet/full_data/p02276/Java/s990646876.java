import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();List<Integer> A=new ArrayList<>();
		for(int i=0;i<n;i++) {
			//A[i]=Integer.parseInt(in.next());
			A.add(Integer.parseInt(in.next()));
		}
		
		
		PrintWriter out=new PrintWriter(System.out);
		A=partition(A);int r=A.get(A.size()-1);
		for(int i=0;i<A.size()-2;i++) {
			if(i==r)out.print("["+A.get(i)+"] ");
			else out.print(A.get(i)+" ");
		}
		out.println(A.get(A.size()-2));
		out.flush();

	}
	
	static List<Integer> partition(List<Integer> A){
		int r=A.size()-1,x=A.get(r),i=-1;
		
		if(A.get(0)<=x)i++;
		for(int j=1;j<r;j++) {
			if(A.get(j)<=x) {
				i++;
				Collections.swap(A, i, j);
			}
		}
		
		i++;
		
		if(i<r && A.get(i)>x) {
			Collections.swap(A, i, r);
		}
		A.add(i);
		return A;
	}

}

