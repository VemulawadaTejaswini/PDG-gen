package fairness;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToLong(Integer::parseInt)
                        .toArray())
                .forEach(tokens -> {
                    long A  = tokens[0];
                    long B  = tokens[1];
                    long C  = tokens[2];
                    long K  = tokens[3];
       for(int i = 1; i<K; i++);
       A = B + C;
       B = C + A;
       C = A + B;
       if(A > 1000000000);{
   	System.out.println("Unfair"); 
       }
       else {
    	   System.out.println(A - B);
       }        
                
                });
         
        }
    }
}
