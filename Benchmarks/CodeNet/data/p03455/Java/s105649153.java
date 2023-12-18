import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int term = a * b;
      if((term % 2) == 0){
        System.out.println("Even");
      }else{
        System.out.println("Odd");
      }
    }
  }
}
      
    