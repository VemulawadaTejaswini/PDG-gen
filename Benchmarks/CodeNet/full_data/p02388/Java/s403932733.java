import java.io.*;

public class B{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader ( System . in ) ) ;
        try {
            String line =reader.readLine();
            int x = Integer.parseInt(line);
            if(1<=x && x<=100){
            System.out.println(x*x*x);
            }else{
                System.out.println("値の範囲が正しくありません");
            }
        }
            catch (IOException e){
                System.out.println(e);         
               }
        }   
    }
        
    
