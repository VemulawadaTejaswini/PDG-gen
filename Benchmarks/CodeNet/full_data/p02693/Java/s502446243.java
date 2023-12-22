import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int k = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
 
    int mulValue = k;
    int mulCount = 1;
    
    while(mulValue <= a){
      mulValue = mulValue * mulCount;
      mulCount++;
    }
    
    if(k <= b){
      System.out.println("OK");
      return;
    }
    System.out.println("NG");
  }
}