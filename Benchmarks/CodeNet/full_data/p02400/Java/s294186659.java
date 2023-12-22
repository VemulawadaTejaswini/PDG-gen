import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            double r;
            String line = reader.readLine();
            r = Double.parseDouble(line);
           System.out.println((Math.PI*r*r)+" "+(Math.PI*r*2));
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
System.out.println("The input number was not correct.");
        }
    }
}

