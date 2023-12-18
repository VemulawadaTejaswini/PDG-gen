import java.util.*;


public class Main {
    public static void main(String[] args) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      int multi　= (N * M)%2;
      if(multi == 1){
        System.out.println("Even");
      }else{
        System.out.println("Odd");
      }
         }
}