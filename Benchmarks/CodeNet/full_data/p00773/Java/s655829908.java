import java.io.*;
import java.util.*;
 
public class Main {
    private static Scanner scr;
	public static void main(String args[]) throws IOException{
	    scr = new Scanner(System.in);
		while (true){
		    try{
				String[] str = scr.nextLine().split(" ", 0);
				int x = Integer.parseInt(str[0]);
				int y = Integer.parseInt(str[1]);
				int s = Integer.parseInt(str[2]);
				if (x==0 && y==0 && s==0) break; //??\?????????
				System.out.println( MaxPrice(x, y, s) );
			}catch(Exception e){
				System.err.println("Exception");
				break;
			}
        }
	}
	
	private static int MaxPrice(int x, int y, int s){
		int max = 0;
		int p=0;
	    for(int i=1; i<=s; i++){
	    	//for(int j=s; j>=s/2; j--){
		    for(int j=i+1; j<=s; j++){
	    		if(Tax(i,j,x)==s){
	    			if((p=Tax(i,j,y))>max) max=p;
	    		}
	    	}
	    }
	    return max;
	}
	private static int Tax(int a, int b, int tax){
		return (a*(100+tax)/100) + (b*(100+tax)/100);
	}
}