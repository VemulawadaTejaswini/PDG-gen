import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

	
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

      
        String[] name = new String[10]; 
        int[] count = new int[10];

        for(int i=0;i<N;i++){
        	String line = in.next();
        	for(int j=0;j<10;j++){
        		if(name[j]==null){
        			name[j] = line;
        			count[j]++;
        			break;
        		}else if(line.equals(name[j])){
        			count[j]++;
        			break;
        		}
        		
        	}
        }
        
        int M = in.nextInt();
        
        for(int i=0;i<M;i++){
        	String line = in.next();
        	for(int j=0;j<10;j++){
        		if(name[j]==null){
        			count[j]--;
        			break;
        		}else if(name[j].equals(line)){
        			count[j]--;
        			break;
        		}
        		
        	}
        }
        int max = 0;
        
        for(int i=0;i<10;i++){
        	if(max<count[i])
        		max = count[i];
        }
        	System.out.println(max);
        in.close();
    }

	
}
