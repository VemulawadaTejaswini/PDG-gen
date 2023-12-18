import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] abcdef = br.readLine().split(" ");
        int a = Integer.parseInt(abcdef[0]);
        int b = Integer.parseInt(abcdef[1]);
        int c = Integer.parseInt(abcdef[2]);
        int d = Integer.parseInt(abcdef[3]);
        int e = Integer.parseInt(abcdef[4]);
        int f = Integer.parseInt(abcdef[5]);
        int total, sugar;
        double max_concentration = 0;
        int anstotal = 0, anssugar = 0;
        
        for (int i = 1; 100*a*i <= f; i++) {
            for (int j = 0; 100*a*i + 100*b*j <= f; j++) {
                for (int k = 0; 100*a*i + 100*b*j + c*k <= f; k++) {
                    for (int l = 0; 100*a*i + 100*b*j + c*k + d*l <= f && (double)100 * (c*k + d*l) / (100*a*i + 100*b*j) <= e; l++) {
                        total = 100*a*i + 100*b*j + c*k + d*l;
                        sugar = c*k + d*l;
                        
                        if ((double)sugar/total > max_concentration) {
                            //System.out.println(i + " " + j + " " + k + " " + l);
                            max_concentration = (double)sugar/total;
                            anssugar = sugar;
                            anstotal = total;
                            //System.out.println(max_concentration);
                        }
                    }
                }
            }
        }
        
        System.out.println(anstotal + " " + anssugar);
    }
}
