import java.io.*;

public class Men{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            int r = Integer.parseInt(line);
            double S = r*r*Math.PI;
            double L = 2*r*Math.PI;
            System.out.println(S+" "+L);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
