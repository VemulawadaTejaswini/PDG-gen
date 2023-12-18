import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int x = sc.nextInt();
      if(k==0){
        System.out.println("No");
        System.exit(0);
      }
      if(500*k>x){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
      
  }
}
