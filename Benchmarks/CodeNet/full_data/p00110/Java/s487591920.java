import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    while((st=sc.readLine())!=null){
		String out = "NA";
		for(int i=0; i<10; i++){
		    String sp = st.replaceAll("X",String.valueOf(i));
		    String[] sp1 = sp.split("[+=]+");
		    if(sp1[0].charAt(0)=='0' || sp1[1].charAt(0)=='0' || sp1[2].charAt(0)=='0')
			continue;
		    if(Integer.valueOf(sp1[0])+Integer.valueOf(sp1[1])==Integer.valueOf(sp1[2])){
			out = String.valueOf(i);
			break;
		    }
		}
		System.out.println(out);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}