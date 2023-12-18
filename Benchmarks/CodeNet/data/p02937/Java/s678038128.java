import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   public static void main(String[] args) {
   
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       String t = sc.next();

       int[][] list = new int[26][2*s.length()];
       int[] lcnt = new int[26];
    		   
       for (int i=1;i<=s.length();i++) {
    	   int tmp=(int)s.charAt(i-1)-97;
    	   list[tmp][lcnt[tmp]]=i;
    	   lcnt[tmp]++;
       }
       for(int i=0;i<26;i++) {
    	   for(int j=0;j<lcnt[i];j++) {
        	   list[i][j+lcnt[i]]=list[i][j]+s.length(); 		   
    	   }
       }
       
       long cnt=0;
       int tmpcnt=0;
       for(int i=0;i<t.length();i++) {
    	   int tmp=(int)t.charAt(i)-97;
    	   if(lcnt[tmp]==0) {
    		   System.out.println(-1);
    		   return;
    	   }
    		   
    	   int right=2*lcnt[tmp];
    	   int left=-1;
    	   while(right-left>1) {
    		   int mid=left+(right-left)/2;
    		   if(list[tmp][mid]>=tmpcnt) right=mid;
    		   else left=mid;
    	   }
    	   cnt=cnt+list[tmp][right]-tmpcnt;
    	   tmpcnt=(int) (cnt%s.length());
       }
       
    System.out.println(cnt); 	
              		
   }

}