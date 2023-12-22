import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
    
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    String txt = input.readLine();
    String A = txt.substring(0, 1);
    String B = txt.substring(2, 3);
    String C = txt.substring(4, 5);
    int intA = Integer.parseInt(A);
    int intB = Integer.parseInt(B);
    int intC = Integer.parseInt(C);
    int[] output = new int[]{intA, intB, intC};
    Arrays.sort(output);
    System.out.println(Arrays.toString(output));
    }
}
