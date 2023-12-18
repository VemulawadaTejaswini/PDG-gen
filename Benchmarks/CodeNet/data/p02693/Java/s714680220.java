import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int k = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
 
    int mulValue = 1;
 
    while(k <= a){
      k = k * mulValue;
      mulValue++;
    }
    
    if(k <= b){
      System.out.println("OK");
      return;
    }
    System.out.println("NG");
  }
}