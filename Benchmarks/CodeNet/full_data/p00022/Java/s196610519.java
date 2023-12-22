import java.io.*;
import java.util.*;

public class Main {
    private static Scanner scr;
	public static void main(String args[]) throws IOException{
	    scr = new Scanner(System.in);
		while (true){
		    try{
		    	int n = Integer.parseInt(scr.nextLine());
				int[] data = new int[n];
				for(int i=0; i<n; i++){
					data[i] = Integer.parseInt(scr.nextLine());
				}
				if (n==0) break; //??\?????????
				System.out.println( SearchMax(data) );
			}catch(Exception e){
				System.err.println("Exception");
				break;
			}
        }
	}
	
	private static int SearchMax(int[] data){
		int max = 0;
		for(int i=0; i<data.length; i++){
			int sump=0;
			for(int j=i; j<data.length; j++){
				sump += data[j];
				if(sump>max) max=sump;
			}
		}
	    return max;
	}
}