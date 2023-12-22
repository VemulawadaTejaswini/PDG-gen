import java.util.*;
class Stack{
    private Object stack[];
    private int stackSize;
    private int sp;
    public Stack(){
	stack = new Object[1000];
	stackSize = stack.length;
	sp = 0;
    }

    public void clear(){ sp = 0; }
    public void push(Object x){ stack[sp++] = x; }
    public Object pop(){ return stack[--sp]; }
}

public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int n = kbd.nextInt();
	int i;
	Stack[] s = new Stack[n];
	for(i=0; i<n; i++){
	    s[i] = new Stack();
	}
	String order = kbd.next();
	while(! order.equals("quit")){
	    if(order.equals("push")){
		i = kbd.nextInt();
		Object x = kbd.next();
		s[i-1].push(x);
	    }
	    else if(order.equals("pop")){
		i = kbd.nextInt();
		System.out.println(s[i-1].pop());
	    }
	    else if(order.equals("move")){
		int a = kbd.nextInt();
		int b = kbd.nextInt();
		Object x = s[a-1].pop();
		s[b-1].push(x);
	    }

	    order = kbd.next();
	}
    }
}