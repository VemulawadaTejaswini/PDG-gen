import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) throws IOException {
    
    	Scanner scan = new Scanner(System.in);
    	
    		
    	char [] line = scan.next().toCharArray();
    	int max = 0;
    	int count = 0;
    	
    	for(int i=0; i<3; i++) {
    		if(line[i] == 'R') {
    			count++;
    			if(i == 2) max = Math.max(max, count);
    		} else {
    			max = Math.max(max, count);
    			count = 0;
    		}
    	}
    	System.out.println(max);
    	
    	}
}
