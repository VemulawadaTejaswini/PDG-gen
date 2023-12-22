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
        if (j != 0) System.out.print("\n");
        for(int k = 0; k < b; k++){
        if((j % 2 == 0 && k % 2 == 0) || (j % 2 == 1 && k % 2 == 1)){
          System.out.print("#");
        }
        else{
          System.out.print(".");
        }
        }
      }
      System.out.println("\n");
    }
  }

}