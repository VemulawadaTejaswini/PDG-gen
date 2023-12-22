import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main{
	static int a,b;
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while(true) {
    	   int m = sc.nextInt();
    	   int nmin = sc.nextInt();
    	   int nmax = sc.nextInt();
    	   if(m+nmin+nmax==0)break;
    	   int[] score = new int[m];
    	   int gap = 0;
    	   int ans = 0;
    	   for(int i=0;i<m;i++) { score[i] = sc.nextInt(); }
    	   for(int i=nmin;i<=nmax;i++) {
    		   if(gap <= score[i-1]-score[i]) {
    			   gap = Math.max(gap, score[i-1]-score[i]);
    			   ans = i;
    		   }
    	   }
    	  System.out.println(ans);
      }
    }
}
