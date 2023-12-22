import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int num = scanner.nextInt();
    String str = "pon";
    //if (num%10 == 2 || num%10 == 4 || num%10 == 5 || num%10 == 7 || num%10 == 9)
    //{String str = "pon";}
    if (num%10 == 0 || num%10 == 1 || num%10 == 6 || num%10 == 8){
      str = "hon";
    }
    else if (num%10 == 3){
      str = "bon";
    }
    System.out.printf(str);
    
  }
}
  
  
  
  