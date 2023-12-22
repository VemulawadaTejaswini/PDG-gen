import java.util.*;

public class Main {
    static double distance(double r,double g,double b){
        return Math.sqrt(r*r+g*g+b*b);
    }
   
   public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       String [] colors = {"000black","001blue","010lime","011aqua","100red","101fuchsia","110yellow","111white"};
       while(sc.hasNextLine()){
           String str = sc.nextLine();
           if(str.equals("0")) break;
           int r0 = Integer.parseInt(str.substring(1,3),16);
           int b0 = Integer.parseInt(str.substring(3,5),16);
           int g0 = Integer.parseInt(str.substring(5,7),16);
           
           String ans = "";
           double min = 450.0;
           
           for(String c:color){
               int r = (c.charAt(0)-'0')*255;
               int b = (c.charAt(1)-'0')*255;
               int g = (c.charAt(2)-'0')*255;
               
               double d = distance(r-r0,g-g0,b-b0);
               if(d<min){
                   min=d;
                   ans=c.substring(3);
               }
           }
           System.out.println(ans);
       }

   }
}
