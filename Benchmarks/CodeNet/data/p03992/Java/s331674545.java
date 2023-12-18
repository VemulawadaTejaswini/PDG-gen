import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String s = scan.next();
	String m = "";
	for(int i=0;i<13;i++){
	    if(i==4)
		m+=" ";
	    else if(i<4)
		m+=String.valueOf(s.charAt(i));
	    else
		m+=String.valueOf(s.charAt(i-1));
	}
	System.out.println(m);
    }
}
