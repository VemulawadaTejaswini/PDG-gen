import java.util.*;

public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      double str1 = scan.nextInt();
      double str2 = scan.nextInt();
      double str3 = scan.nextInt();
      
      double x = Math.min(str2-1,str3);
      
      double result=0;
      result =  Math.floor(str1*x/str2)-str1*Math.floor(x/str2);
      System.out.println(String.format("%,.0f",result));
      scan.close();
    }
}