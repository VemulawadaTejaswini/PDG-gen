import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    while((st=sc.readLine())!=null){
		String[] sp = st.split(" ");
		int p = Math.max(Integer.valueOf(sp[0]),Integer.valueOf(sp[1]));
		int q = Math.min(Integer.valueOf(sp[0]),Integer.valueOf(sp[1]));
		while(q!=0){
		    int a = p;
		    p = q;
		    q = a%q;
		}
		System.out.println(p);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}