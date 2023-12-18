/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    int seen[] = new int[n+1];
	    int max = -1;
	    for(int i=0;i<n;i++){
	        if(seen[arr[i]-1]!=0){
	            seen[arr[i]] = seen[arr[i] - 1]+1;
	        } else {
	            seen[arr[i]] = 1;
	        }
	        max = Math.max(seen[arr[i]], max);
	    }
	    System.out.println(n-max);
	}
}