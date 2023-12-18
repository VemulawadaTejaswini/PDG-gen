import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public double getProbability(int start, double soFar, int heads, int tails, double[] arr) {
       if (start >= arr.length) {
           if (heads > tails) {
               return soFar;
           }
           return 0.0;
       }
       return getProbability(start + 1, soFar * arr[start], heads + 1, tails, arr) + getProbability(start + 1, soFar * (1.0 - arr[start]), heads, tails + 1, arr);
    }
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            String[] split = br.readLine().split(" ");
            double[] arr = new double[split.length];
            for (int i = 0; i < split.length; i++) {
               arr[i] = Double.parseDouble(split[i]); 
            }
          	Main app = new Main();
            double result = app.getProbability(0, 1.0, 0, 0, arr);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
