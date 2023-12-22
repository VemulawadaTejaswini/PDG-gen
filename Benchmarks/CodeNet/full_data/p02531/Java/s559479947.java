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
	Stack s = new Stack();
	String order = kbd.next();
	while(! order.equals("quit")){
	    if(order.equals("push")){
		Object x = kbd.next();
		s.push(x);
	    }
	    else if(order.equals("pop")){
		System.out.println(s.pop());
	    }
	    order = kbd.next();
	}
    }
}