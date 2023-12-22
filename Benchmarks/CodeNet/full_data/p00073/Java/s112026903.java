


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             boolean first=true;
            while((line=br.readLine())!= null){if(line.isEmpty())break;
             int x = Integer.parseInt(line); line=br.readLine();
             int h=Integer.parseInt(line);
             if(x==0&&h==0)break;
             double s = x*x;
             double half_x = (double) x/2;
              //  System.out.println(half_x);
             double syamen = Math.sqrt((half_x*half_x+h*h));
             s+= 2*(syamen*x);
                System.out.println(s);
            }br.close();
       
         }catch(Exception e){e.printStackTrace();}         
     }
     
}
  