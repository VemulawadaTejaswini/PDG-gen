import java.io.*;

public class Main{
    public static void main(String []args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            int a =Integer.parseInt(line);
            line = reader.readLine();
            int b =Integer.parseInt(line);
            int x =2*a+2*b;
            int y =a*b;
            System.out.println(x+" "+y); 
            
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
