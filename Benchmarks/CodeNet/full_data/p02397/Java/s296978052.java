import java.util.Scanner;

public class Main{
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int x = -1;
    int y = -1;
    while( (0 != (x = sin.nextInt())) && (0 != (y = sin.nextInt())) ) {
      if ( x <= y ) { System.out.println(x + " " + y); }
      else { System.out.println(y + " " + x);}
    }

    sin.close();
  }
}
