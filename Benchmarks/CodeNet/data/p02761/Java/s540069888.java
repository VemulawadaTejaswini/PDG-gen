import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*;
public class Main  
{ 
    public static void main(String[] args) throws IOException  
    { 
        //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        String input = reader.readLine(); 
            String[] vs = input.split(" ");
      int n = Integer.valueOf(vs[0]);
      int m = Integer.valueOf(vs[1]);

        int[] res = new int[n];

        for (int i = 0; i < n; ++i) {
          res[i] = -1;
        }

        // Reading data using readLine 
      	for (int i = 0;i < m; ++i) {
         	 String in = reader.readLine(); 
          	String[] line = in.split(" ");
          	int d = Integer.valueOf(line[0]);
            int v = Integer.valueOf(line[1]);

            if (d == 1) {
              if (v == 0)  {
                System.out.println(-1);
                return;
              }
            }

            if (res[d - 1] > v || res[d - 1] == -1) {
              res[d - 1] = v;
            }

        }

        if(res[0] == - 1 || res[0] == 0) {
              System.out.println(-1);
                return;
        }
        for (int i = 0; i < n; ++i) {
          
          System.out.print(res[i] == -1 ? 0 : res[i]);
        }

        //System.out.println("No");         
    } 
} 