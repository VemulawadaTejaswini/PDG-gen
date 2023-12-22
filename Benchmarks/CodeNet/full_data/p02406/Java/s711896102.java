import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    for(int i = 1; i <= a; i++){
      int x = i;
      if(x % 3 == 0 || x % 10 == 3 || x / 10 == 3) System.out.print(" " + x);
      else{
        while(x == 0) x /= 10;
        if(x % 10 == 3) System.out.print(" " + x);
      }
    }
    System.out.println("");
  }
}