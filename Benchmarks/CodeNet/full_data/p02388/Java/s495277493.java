import java.io.*;
     
public class Main{
    public static void main(String[] args) throws Exception{
        int x, cube;

        BufferedReader r = new BufferedReader(new InputStremaReader(System.in));
   
        x = Integer.parseInt(r.readLine);
        cube = x * x * x;
        System.out.println(cube);
             
    }
}