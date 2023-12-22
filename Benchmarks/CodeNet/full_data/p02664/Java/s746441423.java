import java.io.*;
import java.math.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws IOException {
        	Scanner sc = new Scanner(System.in);
        	String a = sc.next();
    		char[] chars = a.toCharArray();
        	for(int i=0;i<chars.length;i++) {
        		if(chars[i]=='?') {
        			chars[i]='D';
        		}
        	}
        	System.out.println(String.valueOf(chars));
    }
}
