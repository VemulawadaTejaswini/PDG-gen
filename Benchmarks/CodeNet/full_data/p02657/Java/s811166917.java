import java.io.*;
public class Main{

    public static void main(String[] args){

        int a=0;
        int b=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            String[] inp = line.split(" ", 0);
            a = Integer.parseInt(inp[0]);
            b = Integer.parseInt(inp[1]);
        
        }catch(IOException e){
        }

        System.out.println(a * b);

    }
}