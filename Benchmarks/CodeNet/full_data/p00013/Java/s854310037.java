import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	Stack s = new Stack();
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n==0){
		int a = (Integer)s.pop();
		System.out.println(a);
	    }
	    else {
		s.push(n);
	    }
	}
    }
}

class Stack{
    Object[] stack;
    int sp;
    public Stack(){
	stack = new Object[1000000];
	sp = 0;
    }
    public void push(Object x){
	stack[sp++] = x;
    }
    public Object pop(){
	return stack[--sp];
    }
}