import java.util.*;

public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      long str1 = scan.nextInt();
      long str2 = scan.nextInt();
      long str3 = scan.nextInt();
      
      long x = Math.min(str2-1,str3);
      
      long result=0;
      result =  (str1*x)/str2-str1*(x/str2);
      System.out.println(result);
        scan.close();
    }
}