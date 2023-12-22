import java.util.*;
class Stack{
    private Object stack[];
    private int stackSize;
    private int sp;
    public Stack(int n){
	stack = new Object[n];
	sp = 0;
    }

    public void clear(){ sp = 0; }
    public void push(Object x){ stack[sp++] = x; }
    public Object pop(){
	if(sp>0)
	    return stack[--sp];
	else return "*";
    }
    public boolean isEmpty(){ return sp==0; }
}

public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int i;

	while(kbd.hasNext()){	
	    Stack stack = new Stack(100);
	    
	    String line = kbd.nextLine();
	    int len = line.length();
	    i=0;
	    String x;
	   
	    if(! line.equals(".")){
		while(i<len){
		    String c = line.substring(i, i+1);
		    //System.out.println(c);
		    if(c.equals("(")){
			stack.push("(");
		    }
		    else if(c.equals(")")){
			x = (String)stack.pop();
			if(! x.equals("("))
			    stack.push("*");
		    }
		    else if(c.equals("[")){
			stack.push("[");
		    }
		    else if(c.equals("]")){
			x = (String)stack.pop();
			if(! x.equals("["))
			    stack.push("*");
		    }
		    i++;
		}
		//System.out.println(stack[0].isEmpty()+" "+stack[1].isEmpty());
		if(stack.isEmpty())
		    System.out.println("yes");
		else 
		    System.out.println("no");
	    }
	}
    }
}
		
		