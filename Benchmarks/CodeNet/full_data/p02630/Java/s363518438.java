import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) throws IOException {
    
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	int [] nums = new int[n];
    	
    	for(int i=0; i<n; i++) {
    		int place_hold = scan.nextInt();
    		nums[i] = place_hold;
    	}
    	
    	int q = scan.nextInt();
    	
    	for(int qq = 0; qq < q; qq++) {
    		int b = scan.nextInt();
    		int c = scan.nextInt();
    		int sum = 0;
    		
    		for(int i=0; i<nums.length; i++) {
    			
    			if(nums[i] == b) nums[i] = c;
    			sum+= nums[i];
    		}
    		System.out.println(sum);
    	}
    	
    }
}

