import java.util.Scanner;

public class SwappinTwoNumbers {
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int x = 0;
    int y = 0;
    while( ( (x = sin.nextInt()) + (y = sin.nextInt()) ) != 0 ) {
      if ( x <= y ) { System.out.println(x + " " + y); }
      else { System.out.println(y + " " + x);}
    }

    sin.close();
  }
}
