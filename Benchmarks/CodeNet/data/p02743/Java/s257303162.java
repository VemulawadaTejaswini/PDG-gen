import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main (String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double eps = Math.pow(10, -14);

        System.out.println(Math.sqrt(a[0]) + Math.sqrt(a[1]) + eps < Math.sqrt(a[2])?"Yes":"No");

   

    }
}