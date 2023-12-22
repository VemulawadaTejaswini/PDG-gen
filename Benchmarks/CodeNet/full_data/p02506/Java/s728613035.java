import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String a, c;
	int b=0;
	a = sc.next().toLowerCase();
	while(sc.hasNext()){
	    c = sc.next();
	    if(c.toLowerCase().equals(a))
		b++;
	    if(c.equals("END_OF_TEXT"))
		break;
	}
	System.out.println(b);
    }
}