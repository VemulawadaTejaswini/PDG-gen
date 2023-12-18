import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int multi = (N*M)%2;
      if(multi == 1){
        System.out.println("Odd");
      }else{
        System.out.println("Even");
      }
         }
}