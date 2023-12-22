import java.io.*;
import java.util.*;
public class Main{
 public static void main(String args[]){
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  try{
   String str=br.readLine();
   StringTokenizer st=new StringTokenizer(str);
   Double a=Double.parseDouble(st.nextToken());
   Double b=Double.parseDouble(st.nextToken());
   Double c=Double.parseDouble(st.nextToken());
   Double d=Double.parseDouble(st.nextToken());
   Double e=Double.parseDouble(st.nextToken());
   Double f=Double.parseDouble(st.nextToken());
   Double x=(f-(e*c/b))/(d-(e*a/b));
   Double y=(c-(a*x))/b;
   System.out.printf("%.3f",x);
   System.out.print(" ");
   System.out.printf("%.3f",y);
  }catch(Exception e){
  }
 }
}