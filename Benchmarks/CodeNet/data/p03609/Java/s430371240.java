import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int x = Integer.parseInt(sc.next());
      int t = Integer.parseInt(sc.next());
      for(int i = 1; i <= t; i++){
        x--;
        if(x == 0){
          break;
        }
      }
      System.out.println(x);
    }
  }
}