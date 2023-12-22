import java.io.*;

public class cycle{
    public static void main(String[] args){
        double l,s;
        int r;
        BufferedReader rbox = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Input r:");
            String line = rbox.readLine();
            r = Integer.parseInt(line);
            l = r * 2 * Math.PI;
            s = r * r * Math.PI;
            System.out.printf("%f %f\n",l,s);
        }catch(NumberFormatException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
