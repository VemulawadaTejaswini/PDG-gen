import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        Stack<String> sk=new Stack<String>();
        while(s.hasNext()){
        	String st=s.next();
        	if(st.equals("0")){
        		if(sk.size()>0){System.out.println(sk.pop());}
        	}
        	else {
        		sk.add(st);
        	}
        }
	}
}
//by Tuvshee 12.05.2012
//Switching Railroad Cars