import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      float a = sc.nextFloat();
      float b = sc.nextFloat();
      float t = sc.nextFloat();
      float time = t+0.5;
      int cou = Math.floor(t/a);
      System.out.println(b*cou); 
  }
}

