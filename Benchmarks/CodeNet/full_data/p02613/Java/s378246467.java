import java.io.*;
import java.util.*;
class Main{
 public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       
              int t = Integer.parseInt(bf.readLine()); 
      int ac=0,wa=0,tle=0,re=0;
   while(t-->0){
  String s = bf.readLine();
     if(s.equals("AC"))
       ac++;
     else if(s.equals("WA"))
       wa++;
     else if(s.equals("TLE"))
       tle++;
     else
       re++;
     
     
   }
  
 
     System.out.println("AC x "+ac);
     System.out.println("WA x "+wa);
     System.out.println("TLE x "+tle);
     System.out.println("RE x "+re);
   
  
        
 }
  
  
  
}