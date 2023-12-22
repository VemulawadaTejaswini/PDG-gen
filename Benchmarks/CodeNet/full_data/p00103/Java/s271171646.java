import java.io.*;
import java.util.ArrayList;
import java.util.List;
 
  
  
  
public class Main {
     
    private static List<String> base = new ArrayList<String>();
    private static int score = 0;
      
    public static void main(String[] args) {
         
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int out = 0;
            String str;
            
                         
            while((str = br.readLine())!=null)
            {
                 
                
                if(str.equals("HIT"))
                {  
                    calHit();     
                }
                 
                else if(str.equals("HOMERUN"))
                {  
                    calHomerun();
                     
                }
                 
                else if(str.equals("OUT"))
                {
                    out++;
            
                }
                 
                if(out==3)
                {
                    break; 
                }
                 
            }
       
            
            System.out.println(score);  
           
            
        }catch (Exception e) {
            e.printStackTrace();
        }
         
    }
      
    private static void calHit() {
          
       if(base.size()==0 || base.size()==1 || base.size()==2)
       {
          base.add("Runner");
       }
        
       else if(base.size()==3)
       {
         score++;
       }
        
    }
      
    private static void calHomerun() {
         
         score = score+base.size()+1;
         base.clear();
          
   }
}