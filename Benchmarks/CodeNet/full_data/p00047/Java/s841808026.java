import java.util.*;

class Main{
   public static void main(String arg[]) throws java.io.IOException{
       Scanner scan =new Scanner (System.in);
      boolean [] cup = new boolean [3];
      cup[0]=true;
       while(scan.hasNext()){
    	   char[] a = scan.next().toCharArray();
    	   int f =a[0]-'A';
    	   int s =a[2] -'A';
    	   cup[f]=cup[f]^cup[s];
    	   cup[s]=cup[f]^cup[s];
    	   cup[f]=cup[f]^cup[s];
       }
       for(int i=0;i<3;i++)
    	   if(cup[i])System.out.println((char)(i+'A'));
   }
}
       