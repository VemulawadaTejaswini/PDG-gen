
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
 
        scan.close();
      
      if((a+b)%2 == 0){
        System.out.println(""+(a+b)/2);
      }else{
        System.out.println("IMPOSSIBLE");
      }
    }
}