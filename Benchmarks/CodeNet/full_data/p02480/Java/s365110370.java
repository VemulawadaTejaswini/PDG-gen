// Sample4.java
import java.io.*;
public class Sample4
{
        public static void main(String args[])
        {
                int x;
                //System.out.print("input integer: ");
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                try{
                        String buf = br.readLine();
                        x = Integer.parseInt(buf);
                }catch(Exception e){
                        x = 0;
                }
		x = x * x * x;
                System.out.println("Input Number = " + x);
        }
}