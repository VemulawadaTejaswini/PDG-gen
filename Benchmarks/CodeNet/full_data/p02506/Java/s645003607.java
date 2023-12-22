import java.util.*;
public class Main {
	public static void main(String args[]){
	    Scanner s=new Scanner(System.in);
	    int count=0;
	    String key=s.next();
	    key=key.toLowerCase();
	    while(s.hasNext()){
	    	String st=s.next();
	    	st=st.toLowerCase();
	    	if(st.equals(key))count++;
	    }
	    System.out.println(count);
	}
}