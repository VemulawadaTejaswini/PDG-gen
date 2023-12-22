import java.io.*;

public class Main {
      
    public static void main(String[] args) throws IOException {
         
    
        	
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            String str;
            int out = 0;
            int runner = 0;
            int score = 0;
                         
            while(out<3)
            {
            	str = br.readLine();
                if(str.equals("HIT"))
                {
                    if(runner<3)
                    {
                    	runner++;
                    }
                    else
                    {
                    	score++;
                    }
                }
                 
                if(str.equals("HOMERUN"))
                {   
                    score = score + runner + 1;
                    runner = 0;
                }
                 
                if(str.equals("OUT"))
                {
                    out++;
                }
                 
                 
            }
             
            System.out.println(score);  
            
       
         
    }
}