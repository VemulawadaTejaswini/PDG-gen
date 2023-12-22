import java.io.*;

public class Main{
    public static void main(String args[]){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            double radius = Integer.parseInt(line);
            double x = Math.PI;
            double area = radius * radius * x;
            double circle = 2 * radius * x;
            System.out.printf("%.6f", area);
            System.out.print(" ");
            System.out.printf("%.6f", circle);
        } catch(IOException e){
            System.out.println(e);
        } 
    }
}
