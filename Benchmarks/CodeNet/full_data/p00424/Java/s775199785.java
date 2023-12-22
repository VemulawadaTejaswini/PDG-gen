import java.util.Scanner;

public class Main{
	static Scanner in = new Scanner(System.in);
	   
	static int n, m;
	static String[] before, after;
	static String[] input;
	
    public static void main(String[] args) {
    	while (input()) {
    		System.out.println(result());
    	}
    	
	    in.close();
	    return;
    }
    
    static String result() {
    	String resultStr = "";
    	int count = 0;
    	
 	   for (int i = 0; i < m; i ++) {
 		   count = 0;
 		   for (int j = 0; j < n; j ++) {
 			   if (input[i].equals(before[j])) {
 				   resultStr += after[j];
 				   break;
 			   }
 			   count ++;
 		   }
 		   
 		   if (count == n) resultStr += input[i];
 	   }
 	   
 	   return resultStr;
    }
    
   static boolean input() {	   
	   n = in.nextInt(); if (n == 0) return false;
	   before = new String[n]; after = new String[n];
	   
	   for (int i = 0; i < n; i ++) {
		   before[i] = in.next();
		   after[i] = in.next();
	   }
	   
	   m = in.nextInt();
	   input = new String[m];
	   
	   for (int i = 0; i < m; i ++) {
		   input[i] = in.next();
	   }

	   return true;
   }
}