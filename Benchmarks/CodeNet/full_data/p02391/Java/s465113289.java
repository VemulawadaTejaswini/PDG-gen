import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException  {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        String[] line = reader.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        
        if(a < b){
            System.out.println("a < b");
        }
        
        if(a > b){
            System.out.println("a > b");
        }
        
        if(a == b){
            System.out.println("a == b");
        }
    
    }
    
}