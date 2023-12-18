import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String strStdIn = in.readLine();
        int n = Integer.parseInt(strStdIn);
        String[] data = in.readLine().split(" ");
        
        int sum = Integer.parseInt(data[0]);
        for(int i = 1; i < n - 1; i++) {
            int a = Integer.parseInt(data[i-1]);
            int b = Integer.parseInt(data[i]);
            if(a < b) {
                sum += a;
            } else {
                sum += b;
            }
        }
        if (n > 0) { sum += Integer.parseInt(data[n-2]); }
        
        System.out.println(sum);
    }
}