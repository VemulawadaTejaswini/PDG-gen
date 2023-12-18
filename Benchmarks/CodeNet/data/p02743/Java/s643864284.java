import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main (String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        DecimalFormat df = new DecimalFormat("0.000000000");
        double sqA = Double.parseDouble(df.format(Math.sqrt(a[0])));
        double sqB = Double.parseDouble(df.format(Math.sqrt(a[1])));
        double sqC = Double.parseDouble(df.format(Math.sqrt(a[2])));

        System.out.println(sqA+sqB<sqC?"Yes":"No");

   

    }
}