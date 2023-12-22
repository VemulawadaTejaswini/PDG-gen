import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        String[] temp = line.split("\\s");
        br.close();

        int num1 = Integer.parseInt(temp[0]);
        int num2 = Integer.parseInt(temp[1]);
        
        int a1 = num1 / num2;
        int a2 = num1 % num2;
        double a3 = (double)num1 / (double)num2;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}