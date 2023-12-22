
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    
    public static void main(String[] args)  {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line=br.readLine())!=null){
                String[] split=line.split(" ");
                for(int i=0; i<split.length;i++){
                    String str = split[i];
                    if(str.equals("apple"))str="peach";
                    else if(str.equals("peach"))str="apple";
                    System.out.print(str);
                    if(i!=split.length-1)System.out.print(" ");
                }
                
                

            }
        }catch(Exception e){}
        
    }
}