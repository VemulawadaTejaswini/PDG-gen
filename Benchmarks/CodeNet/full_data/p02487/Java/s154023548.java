import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r, c; // row, col
    while((r = sc.nextInt()) != 0 | (c = sc.nextInt()) != 0){
      for(int j = 0 ; j < c; j++){
        System.out.printf("#");
      }
      System.out.println();
      String comma = "";
      for(int j = 0; j < c -2; j++)
        comma += ".";
      for(int i = 1; i < r - 1; i++){
          System.out.println("#"+comma+"#");
        }
      for(int j = 0 ; j < c; j++){
        System.out.printf("#");
      }
      System.out.println();
    }
  }
}