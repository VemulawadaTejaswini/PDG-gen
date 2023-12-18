import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
  Scanner sc = new Scanner(System.in);
 
  public static void main(String[] args) {
    new Main().run();
  }


  void run() {
   int n=sc.nextInt();
   int k=sc.nextInt();
   int result=0;
   result=((int)Math.pow(k-1, n-1))*k;
   System.out.println(result);
   
   
  }
 

 
  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}