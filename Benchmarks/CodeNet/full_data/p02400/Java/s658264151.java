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
            System.out.print(area);
            System.out.print(" ");
            System.out.println(circle);
        } catch(IOException e){
            System.out.println(e);
        } catch(NumberFormatException e){
            System.out.println("Not 0<r<10000");
        }
    }
}
