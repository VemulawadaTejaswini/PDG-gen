import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int total = 0;
      int i;
      for(i=0;i<n-2;i++){
        if(s.charAt(i)=='A'){
          if(s.charAt(i+1)=='B'){
            if(s.charAt(i+2)=='C'){
              total += 1;
            }
          }
        }
      }
      System.out.println(total);
      
  }
}
