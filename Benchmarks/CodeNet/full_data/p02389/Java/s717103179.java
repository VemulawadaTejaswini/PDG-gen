import java.io.*;
public class Main{
    public static void main(String[] args)throws IOExption{
        BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
        String input2 = input1.readLine();
        String[] fac = input2.split("\\s+");
        int a = Integer.parseInt(fac[0]);
        int b = Integer.parseInt(fac[1]);
        int ab = a * b;
        int syu = 2 * (a + b);
        System.out.println(ab+" "+syu);

        }
    }

