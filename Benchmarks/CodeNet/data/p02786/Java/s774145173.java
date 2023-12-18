import java.util.Scanner;
import java.lang.Math; 
public class Main
{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
     int h= 8;
     int ans=0,c=1;
     while(h>=1)
     {
         h=h/2;
         ans=ans+c;
         c=c*2;
     }
     System.out.println(ans);
    }
}