import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int tap_a = scanner.nextInt();	
      int tap_b = scanner.nextInt();
      int in_chk = 0;
      int tap_out ;	
      
      if (tap_a >= tap_b){tap_out = 1;}
      else{
        tap_out = (tap_b - 1) / (tap_a - 1);
        if ((tap_b % (tap_a - 1)) != 1) {
        tap_out = tap_out + 1;}
      }
        
      System.out.println(tap_out);
      
      return;
    }
  }
