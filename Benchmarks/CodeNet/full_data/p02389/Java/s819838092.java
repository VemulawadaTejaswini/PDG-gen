import java.io.*;
public class main
{
        public static void main(String args[])
        {
                double a, b;

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                try{
                        String buf = br.readLine();
                        a = Double.valueOf(buf).doubleValue();
                        buf = br.readLine();
                        b = Double.valueOf(buf).doubleValue();
                }catch(Exception e){
                        x = 0.0;
                        y = 0.0;
                }
                System.out.println(a*b);
                System.out.println(2*(a+b));
        }
}
