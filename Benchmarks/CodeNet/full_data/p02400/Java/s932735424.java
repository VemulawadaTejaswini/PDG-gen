import java.io.*;
public class Main {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            double r=Double.parseDouble(line);
            System.out.printf("%.6f %.6f\n",2*Math.PI*r,Math.PI*r*r);
        }
        catch(IOException e){
        }
    }
}
