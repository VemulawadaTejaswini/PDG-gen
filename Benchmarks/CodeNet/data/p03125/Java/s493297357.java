import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int numberA = sc.nextInt();
    int numberB = sc.nextInt();
    
    if(numberB%numberA == 0){
      System.out.println(numberA + numberB);
    }else {
      System.out.println(numberB - numberA);
    }
    
  }
}