import java.io.*;

public class Main {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            double r=Integer.parseInt(line);
            System.out.printf("%6f %6f",2*Math.PI*r,Math.PI*r*r);
        }catch (IOException e){
     System.out.println(e);
        }
    }
}
