import java.util.*;

public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      double str1 = Double.parseDouble(scan.next());
      double str2 = Double.parseDouble(scan.next());
      double str3 = Double.parseDouble(scan.next());
      scan.close();
      
      double result=0;
      if(str3 >= str2-1)
      	System.out.println((long)(str1-str1/str2));
      else
        System.out.println((long)(str1*str3/str2)-str1*(long)(str3/str2));
      
    }
}