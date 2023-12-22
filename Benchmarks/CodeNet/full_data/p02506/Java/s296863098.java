import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public  static void main(String[] args){
	int cnt=0;
	String x = kbd.next();
	while(kbd.hasNext()){
	    String s = kbd.next();
	    if(!s.equals(END_OF_TEXT)){
		if(s.substring(s.length()-1, s.length()).equals("."))
		    s = s.substring(0, s.length()-1);
		if(s.equals(x)) cnt++;
	    }
	    System.out.println(cnt);
	}
    }
}