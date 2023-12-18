import java.util.*;

public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      double str1 = scan.nextInt();
      double str2 = scan.nextInt();
      double str3 = scan.nextInt();
      
      double result=0;
      if(str3 < str2)
       result = Math.floor(str1*str3/str2);
      else
       result = Math.floor(str1*(str2-1)/str2);
       
      System.out.println(String.format("%,.0f",result));
      scan.close();
    }
}