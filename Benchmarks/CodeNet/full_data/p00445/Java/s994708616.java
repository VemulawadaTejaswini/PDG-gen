import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String st = new String(sc.next());
	int x=0, y=0;
	for(int i=0; i<st.length()-2; i++){
	    if(st.substring(i, i+1).equals("J") && st.substring(i+1, i+2).equals("O") && st.substring(i+2, i+3).equals("I"))
		x++;
	    if(st.substring(i, i+1).equals("I") && st.substring(i+1, i+2).equals("O") && st.substring(i+2, i+3).equals("I"))
		y++;
	}
	System.out.println(x);
	System.out.println(y);
    }
}