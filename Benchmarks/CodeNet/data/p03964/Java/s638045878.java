import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        line1 = line1.trim();
        int N = Integer.parseInt(line1);
        long PosA = 0;
        long PosB = 0;
        long a = 0;
        long b = 0;
        long mag = 0;

        for(int i = 0;i<N;i++){
            String lines = br.readLine();
            lines = lines.trim();            
            String[] temp = lines.split(" ");
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);

            if(PosA <= a && PosB <= b){
                PosA = a;
                PosB = b;
            } else {
                mag = (long)Math.ceil(Math.max((double)PosA/a, (double)PosB/b));
                PosA = a * mag;
                PosB = b * mag;            
            }
        }

        System.out.println(PosA+PosB)
    }
}

