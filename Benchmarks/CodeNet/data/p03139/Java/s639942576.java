import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(in.readLine());
            int A = Integer.parseInt(in.readLine());
            int B = Integer.parseInt(in.readLine());
            int max = 0;
            int min = 0;
            int large = 0;
            int small = 0;
            int diff = 0;
            
            if (N < A || N < B) {
                System.out.println("Error");
                System.exit(0);
            }
            
            if (A > B) {
                max = B;
                large = A;
                small = B;
            } else {
                max = A;
                large = B;
                small = A;
            }
            
            diff = N - large;
            if (diff < small) {
                min = small - diff;
            } else {
                min = 0;
            }
            System.out.println(max + " " + min);
        } catch(Exception e) {
            System.out.println(e);
            System.exit(0);
        } 
    }
}
