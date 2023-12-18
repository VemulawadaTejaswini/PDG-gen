import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      float a = sc.nextFloat();
      float b = sc.nextFloat();
      if(a%3==0||b%3==0||(a+b)%3==0){
        System.out.println("Possible");
      }else{
        System.out.println("Impossible");
      }
        
  }
}
