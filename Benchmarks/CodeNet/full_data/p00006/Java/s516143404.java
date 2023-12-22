import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	try{
	    BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	    String st = s.readLine();
	    for(int i=st.length()-1; i>=0; i--)
		System.out.print(st.charAt(i));
	    System.out.println();
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}