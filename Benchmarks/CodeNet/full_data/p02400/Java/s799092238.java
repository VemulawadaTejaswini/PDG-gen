import java.io.*;

public class Circle{
    public static void main(String[] args){
        double r,S,C;
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("r:");
            line=reader.readLine();
            r=Double.parseDouble(line);

            S=r*r*Math.PI;
            C=2.0*r*Math.PI;
            
            System.out.println(S);
            System.out.println(C);

        }catch(NumberFormatException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
