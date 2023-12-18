import java.util.*;
class Main 
{
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);
    String input =sc.next();	
    if(input.equals("Sunny")){
      System.out.println("Cloudy");
     
    } else if(input.equals("Cloudy")) {
      System.out.println("Rainy");
    } else if(input.equals("Rainy")){
      System.out.println("Sunny");
    }
    
  }
}
