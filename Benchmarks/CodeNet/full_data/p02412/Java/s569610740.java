import java.io.*;
import java.util.*;

public class Main { 
	public static void main(String args[]) throws IOException{
		Scanner scr = new Scanner(System.in);
		while (true){
		    try{
				String[] str = scr.nextLine().split(" ", 0);
				int n = Integer.parseInt(str[0]);
				int x = Integer.parseInt(str[0]);
				if (n==0 && x==0) break; //??\?????????
				System.out.println( SearchTrio(n, x) );
			}catch(Exception e){
				System.err.println("Exception");
				break;
			}
        }
		scr.close();
	}
	
	
	private static int SearchTrio(int n, int x){
		int r=0;
	    for(int i=1; i<=(n/3); i++){
	    	r += SearchPair(i, n, x-i);
		}
	    return r;
	}
	
	private static int SearchPair(int min, int max, int x){
		int r=0;
		for(int i=min; i<(min + max)/2; i++){
			if( x - i < max) r++;
		}
		return r;
	}
}