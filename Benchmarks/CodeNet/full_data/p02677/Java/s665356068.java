import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;
public class Main {
public static void main (String[]args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
        DecimalFormat df = new DecimalFormat("0.000000000");
        String  lines = br.readLine();    

        String[] strs = lines.trim().split("\\s+");
         int [] a = new int [4];
        for (int i = 0; i < strs.length; i++) {
        a[i] = Integer.parseInt(strs[i]);
        }

    // Cosine Law solve 

  double radian = Math.PI * 2 * ((double)a[2] / 12.0 + ((double)a[3] / 60.0) / 12.0 - (double)a[3]/ 60.0);
    
  double ans = (double)(a[0] * a[0]+ a[1] * a[1]) - (double)(2 * a[0] *
  a[1]) * Math.cos(radian);
  System.out.println(df.format(Math.sqrt(ans)));

    }catch (Exception e) {
       }
       }
   }