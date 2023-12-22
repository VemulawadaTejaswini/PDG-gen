import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	boolean closed= true;
    	int N= Integer.parseInt( br.readLine() );
    	String[] user= new String[N];
    	for(int i=0;i<N;i++){
    		user[i]= br.readLine();
    	}
    	Arrays.sort(user);
    	
    	int Q= Integer.parseInt( br.readLine() );
    	String key= new String();
    	for(int i=0;i<Q;i++){
    		key= br.readLine();
    		if( Arrays.binarySearch(user, key) >=0 ){
    			if(closed){
    				System.out.println("Opened by "+key);
    				closed= false;
    			} else{
    				System.out.println("Closed by "+key);
    				closed= true;
    			}
    		} else{
    			System.out.println("Unknown "+key);
    		}
    	}
    }
}