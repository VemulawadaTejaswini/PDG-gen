import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{
    public static void main(String[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Deque<Integer> stack = new ArrayDeque<Integer>();
	Deque<A> s_e_stack = new ArrayDeque<A>();
	
	int sum=0;
	
	try{
	    char[] line = br.readLine().toCharArray();
	    for(int i=0;i<line.length;i++){
		if(line[i] == '\\'){
		    stack.push(i);
		}else if(line[i] == '/'){
		    if(stack.isEmpty()){
			continue;
		    }
		    int st = stack.pop();
		    int en = i;
		    int ar = en-st;
		    sum+=ar;
		    
		    while(!s_e_stack.isEmpty() && s_e_stack.peek().start > st && s_e_stack.peek().end < en){
			A a;
			a = s_e_stack.pop();
			ar += a.area;
		    }
		    s_e_stack.push(new A(st,en,ar));
		}
	    }
	    
	    System.out.println(sum);
	    System.out.print(s_e_stack.size());
	    int n = s_e_stack.size();
	    for(int i=0;i<n;i++){
		System.out.print(" "+s_e_stack.getLast().area);
		s_e_stack.removeLast();
	    }
	    System.out.println();
	}catch(Exception e){
	    e.printStackTrace();
	}
    }
}

class A{
    int start;
    int end;
    int area;

    public A(int a, int b, int c){
	start = a;
	end = b;
	area = c;
    }
}

