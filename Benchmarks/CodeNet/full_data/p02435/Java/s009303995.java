import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		
		int n=Integer.parseInt(in.next()),q=Integer.parseInt(in.next());
		mystack A[]=new mystack[n];
		for(int i=0;i<n;i++)A[i]=new mystack();
		
		for(int i=0;i<q;i++){
			int query=Integer.parseInt(in.next());
			
			switch(query){
			case 0:
				int t1=Integer.parseInt(in.next()),x=Integer.parseInt(in.next());
				A[t1].stk.push(x);
				break;
				
			case 1:
				int t2=Integer.parseInt(in.next());
				if(!A[t2].stk.isEmpty())out.println(A[t2].stk.peek());
				break;
				
			case 2:
				int t3=Integer.parseInt(in.next());
				if(!A[t3].stk.isEmpty())A[t3].stk.pop();
				break;
			}
		}
		out.flush();
	}

}

class mystack{
	Stack<Integer> stk;
	
	mystack(){
		stk=new Stack<>();
	}
}

