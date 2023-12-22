import java.util.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
      int flag = 0;
      char []x =a.toCharArray();
      char []y =b.toCharArray();
      for(int i=0;i<x.length;i++){
        if(x[i]!=y[i]){
          flag = 1;
          break;
        }
      }
      if(flag==0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");

      }

     

      
    }
}