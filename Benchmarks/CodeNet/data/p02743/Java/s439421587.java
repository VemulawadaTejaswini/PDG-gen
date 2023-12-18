import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main (String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long a[] = Arrays.stream(in.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long x = (a[2]-a[0]-a[1]);
        long y = 4*a[0]*a[1];

        System.out.println(x>0 && x*x>y?"Yes":"No");

   

    }
}