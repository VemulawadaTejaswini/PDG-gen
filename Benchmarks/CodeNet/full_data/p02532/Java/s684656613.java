import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i, t = sc.nextInt();
	String st;
	ArrayList<String> pp = new ArrayList<String>();
	ArrayList<Stack<String>> x = new ArrayList<Stack<String>>();
	for(i=0; i<t; i++)
	    x.add(new Stack<String>());
	while(true){
	    st = sc.next();
	    if(st.equals("quit"))
		break;
	    else if(st.equals("push")){
		x.get(sc.nextInt()-1).push(sc.next());
	    }	    
	    else if(st.equals("pop"))
		pp.add(x.get(sc.nextInt()-1).pop());
	    else if(st.equals("move")){
		i=sc.nextInt();
		x.get(sc.nextInt()-1).push(x.get(i-1).pop());
	    }
	}
	for(i=0; i<pp.size(); i++)
	    System.out.println(pp.get(i));
    }
}