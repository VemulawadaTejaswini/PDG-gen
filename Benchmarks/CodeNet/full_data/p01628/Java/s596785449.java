import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
 
public class Main{
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	final int N = sc.nextInt();
    	final int M = sc.nextInt();
    	
    	int[] high = new int[N];
    	
    	int max = 0;
    	for(int i = 0; i < M; i++){
    		final int bar  = sc.nextInt();
    		final int bar_ = bar - 1;
    		
    		final int hi = Math.max(high[bar], high[bar_]);
    		
    		high[bar] = high[bar_] = hi + 1;
    		max = Math.max(max, hi + 1);
    	}
    	System.out.println(max);
    	
    }
     
}