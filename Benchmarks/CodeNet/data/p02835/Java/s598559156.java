import java.io.InputStream;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    System.out.println(new Main().excute(System.in)); 
  }
  public String excute(InputStream f) {
    Scanner scan = new Scanner(f);
    int A1  = scan.nextInt();
    int A2  = scan.nextInt();
    int A3  = scan.nextInt();
    
    if ((A1+A2+A3) >= 22)  {
      return "bust";
    }
    return  "win";
  }
}
