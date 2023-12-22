import java.io.*;

public class B{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader ( System . in ) ) ;
        try {
            String line =reader.readLine();
            int n = Integer.parseInt(line);
            if(1<=n && n<=100){
            System.out.println(n*n*n);
            }else{
                System.out.println("値の範囲が正しくありません");
            }
        }
            catch (IOException e){
                System.out.println(e);         
               }
        }   
    }
        
    
