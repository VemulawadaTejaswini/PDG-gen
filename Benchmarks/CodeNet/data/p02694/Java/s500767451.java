import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int targetPrice = scanner.nextInt();
    int basePrice = 100;
    
    int year = 0;
    
    while(basePrice <= targetPrice){
      basePrice = basePrice + basePrice * 0.01;
      year++;
    }
    
    System.out.println(year);
    
  }
}