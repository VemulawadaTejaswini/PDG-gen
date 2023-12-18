import java.util.*;
import java.io.*;

public class Main {
    public static void changeLastLetter(String original){
    	String pre = original.substring(0,original.length()-1);
    	for(char x=(char)(original.charAt(original.length()-1)+1);x<='z';x++){
    	    if(!pre.contains(Character.toString(x))){
    	    	System.out.println(pre+x);
    	    	System.exit(0);
    	    }
    	}
    }
    public static void addOneLetter(String original){
    	for(char x='a';x<='z';x++){
    	    if(!original.contains(Character.toString(x))){
    	    	System.out.println(original+x);
    	    	System.exit(0);
    	    }
    	}
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        addOneLetter(S);
        
        while(!S.equals("")){
        	changeLastLetter(S);
        	
        	S = S.substring(0,S.length()-1);
        	
        }
        System.out.println(-1);
    }
}