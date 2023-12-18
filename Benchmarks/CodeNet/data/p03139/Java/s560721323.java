import java.io.*;

public class Sample1{

     public static void main(String []args) throws IOException {
        
        try{
        
        
            //格納(N A B)
            int n = 0
            int a = 0
            int b = 0
            
            for(int i = 0; i < 3; i++){
                
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                int num = Integer.ParseInt(in.readLine());
                
                
                switch(i){
                    case 0:
                        n = num;
                    case 1:
                        a = num;
                    case 2:
                        b = num;
                    
                 }
               }
            
            String max = new String();
            String min = new String();
            
            //max算出
            if(a <= b){
                max = a
            }else{
                max = b
            }
            
            //min算出
            int tmp = a + b - n;
            
            if(tmp >= 0){
                min = tmp
            }else{
                min = 0
            }
            
            System.out.println( max + " " + min );
            
        
         }catch(Exception e){
        
           System.out.println(e); 
           
         }
     }
}