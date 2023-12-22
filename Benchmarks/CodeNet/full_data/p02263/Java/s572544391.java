import java.util.Scanner;
class Main
{
	static class Stack
	{
		int A[], head;
		Stack( int size )
		{
			A = new int[size+1];
			head = 0;
		}
		void show()
		{
			for( int i = 1 ; i < A.length ; i++ )
				if( i==A.length-1 )System.out.println(A[i]);
				else System.out.print(A[i]+" ");
		}
		boolean isEmpty(){return head==0;}
		boolean isFull( ){return head==A.length-1;}
		void push( int key )
		{
			if( isFull() )return;
			A[++head] = key;
		}
		int pop()
		{
			if( isEmpty() )return 0;
			return A[head--];
		}
	}
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		String com;
		Stack stack = new Stack(100);
		while( sc.hasNext() )
		{
			com = sc.next();
			
			if( com.equals("+") )
				stack.push( stack.pop()+stack.pop() );
			else if( com.equals("-") )
				stack.push( -1*stack.pop()+stack.pop() );
			else if( com.equals("*") )
				stack.push( stack.pop()*stack.pop() );
			else
				stack.push(Integer.parseInt(com));
		}
		System.out.println( stack.pop() );
	}
}