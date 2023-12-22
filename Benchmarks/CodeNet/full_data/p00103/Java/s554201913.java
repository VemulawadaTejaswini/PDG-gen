import java.io.*;
import java.util.*;
 
  
  
  
public class Main {
     
    private static List<String> base = new ArrayList<String>();
    private static int score = 0;
      
    public static void main(String[] args) {
         
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());  
            String str = "";
            int out = 0;
         
            for(int i = 0; i<N; i++)
            {
            	while(out<3)
            	{
                 
              
                	if(str.equals("HIT"))
                	{
                     
                		calHit();
                     
                	}
                 
                	if(str.equals("HOMERUN"))
                	{
                     
                		calHomerun();
                     
                	}
                 
                	if(str.equals("OUT"))
                	{
                		out++;
            
                	}
               
                
             
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