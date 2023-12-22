import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    while(true){
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if(a == 0 && b == 0){
        break;
      }

      for(int j = 0; j < a; j++){
        if(j != 0){
          System.out.print("\n");
        }
        for(int k = 0; k < b; k++){
          System.out.print("#");
        }
      }
      System.out.print("\n\n");
    }
  }

}