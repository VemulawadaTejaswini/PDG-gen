import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
   int k = s.nextInt();
   s.nextLine();
   String inp = s.nextLine();
   int rep = s.nextInt();
   char txt = inp.charAt(rep-1);
   String res = "";
   
   for(int i=0; i<k; i++){
   if(inp.charAt(i) != txt){
   res = res +'*' ;
   }
     else{
     res = res + txt;
     }
   }
   
   System.out.print(res);
 }
}