import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    String st;
	    st = sc.readLine();
	    int[] x = new int[26];
	    int j;
	    for(int i=0; i<st.length(); i++){
		j=(int)st.charAt(i);
		if(j>='a' && j<='z')
		    x[j-'a']+=1;
		else if(j>='A' && j<='Z')
		    x[j-'A']+=1;
	    }
	    for(int i=0; i<26; i++)
		System.out.println((char)(i+97)+" : "+x[i]);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}