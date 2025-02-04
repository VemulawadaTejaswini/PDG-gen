//make sure to make new file!
import java.io.*;
import java.util.*;

public class Main{
   
   public static void main(String[] args)throws IOException{
      BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter out = new PrintWriter(System.out);
      
      StringTokenizer st = new StringTokenizer(f.readLine());
      
      double a = Double.parseDouble(st.nextToken());
      double b = Double.parseDouble(st.nextToken());
      int h = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      
      int hangle = ((h%12)*30+m/2 + 360)%360;
      int mangle = m*6;
      
      double hr = Math.toRadians((double)hangle);
      double mr = Math.toRadians((double)mangle);
      
      double hx = a*Math.cos(hr);
      double hy = a*Math.sin(hr);
      double mx = b*Math.cos(mr);
      double my = b*Math.sin(mr);
      
      double answer = Math.sqrt((mx-hx)*(mx-hx) + (my-hy)*(my-hy));
      out.println(answer);
      
      
      
      
      
      
      
      
      
      out.close();
   }
   
      
}