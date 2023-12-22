import java.io.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
    
    BufferedReader inputA = new BufferedReader (new InputStreamReader(System.in));
    String A   = inputA.readLine();
    BufferedReader inputB = new BufferedReader (new InputStreamReader(System.in));
    String B   = inputB.readLine();
    BufferedReader inputC = new BufferedReader (new InputStreamReader(System.in));
    String C   = inputC.readLine();
    
    int aa = Integer.parseInt(A);
    int bb = Integer.parseInt(B);
    int cc = Integer.parseInt(C);
    
    int[] output = new int[]{aa, bb, cc};
    for(int i = 0; i < output.length; i++)
    System.out.println(output[i]);
    
    }
}
