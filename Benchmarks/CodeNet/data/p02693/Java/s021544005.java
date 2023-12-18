import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int k = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
 
    int mulValue = 1;
 
    while(k <= b){
      if(a <= k && k <= b){
        System.out.println("OK");
        return;
      }
      k = k * mulValue;
      mulValue++;
    }
    System.out.println("NG");
  }
}