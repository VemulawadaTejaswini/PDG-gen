import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	String st;
	try{
	    while(true){
		st=sc.readLine();
		if(st.equals("#"))
		    break;
		char[] c = st.toCharArray();
		int count=0, t = check(c[0]);
		for(int i=1; i<c.length; i++)
		    if(t != check(c[i])){
			count++;
			t = check(c[i]);
		    }
		System.out.println(count);
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
    private static int check(char c){
	if(c=='q'||c=='w'||c=='e'||c=='r'||c=='t'||c=='a'||c=='s'||c=='d'||c=='f'||c=='g'||c=='z'||c=='x'||c=='c'||c=='v'||c=='b')
	    return 1;
	else
	    return 2;
    }
}