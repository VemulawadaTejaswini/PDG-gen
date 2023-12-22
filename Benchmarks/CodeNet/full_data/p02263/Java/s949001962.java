import java.util.Scanner;

class Main{
	
	static int top;
	static int [] stack = new int[1000];
  
	static void push(int x){
		stack[++top] = x;
	}

	static int pop(){
		top--;
		return stack[top + 1];
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		int a,b;
		top = 0;
		while(sc.hasNext()){ 
            		s = sc.next();
            		if(s.equals("+")){
                		a = pop();
                		b = pop();
                		push(a + b);
            		}
            		else if(s.equals("-")){
                		a = pop();
                		b = pop();
                		push(b - a);
            		}
            		else if(s.equals("*")){
                		a = pop();
                		b = pop();
                		push(a * b);
            		}
            		else{
                		push(Integer.parseInt(s));	
            		}
		}

		System.out.println(pop());
	}
}