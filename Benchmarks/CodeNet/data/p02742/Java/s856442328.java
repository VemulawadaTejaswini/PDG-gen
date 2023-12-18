import java.util.*;
import java.io.*;
public class main {
    public static void main (String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        if(a[0] == 1 || a[1] == 1) {
            System.out.println(1);
        }
        else{
            System.out.println((a[0]*a[1] + 1)/2);
        }
    }
}