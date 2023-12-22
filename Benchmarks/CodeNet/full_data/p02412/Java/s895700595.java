import java.io.*;
import java.util.*;

public class Main { 
	public static void main(String args[]) throws IOException{
		Scanner scr = new Scanner(System.in);
		while (true){
		    try{
				String[] str = scr.nextLine().split(" ", 0);
				int n = Integer.parseInt(str[0]);
				int x = Integer.parseInt(str[1]);
				if (n==0 && x==0) break; //??\?????????
				System.out.println( SearchTrio(n, x) );
			}catch(Exception e){
				System.err.println("Exception");
				break;
			}
        }
		/*String[] str = scr.nextLine().split(" ", 0);
		System.out.println( SearchPair(Integer.parseInt(str[0]),
				Integer.parseInt(str[1]), Integer.parseInt(str[2])) );*/
		scr.close();
	}
	
	
	private static int SearchTrio(int n, int x){
		int r=0;
	    for(int i=1; i<(x/3); i++){
	    	r += SearchPair(i+1, n, x-i);
		}
	    return r;
	}
	
	// min??\???max??\??????2??°????????§x???????????????
	private static int SearchPair(int min, int max, int x){
		if( min+max <= x) return Math.max((max - x/2), 0);
		else return Math.max((CeilDiv(x,2) - min),0);
	}
	private static int CeilDiv(int divided, int divider){
		if(divided%2==0) return divided/divider;
		else return divided/divider+1;
	}
}