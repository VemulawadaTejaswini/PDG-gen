import java.util.Scanner;
import java.util.Arrays;
 
class Main {
  public static void main(String args[]) {
 
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int num = scan.nextInt();
 
    int[] attack = new int[num];
 
    for(int i = 0; i < num; i++){
      h -= scan.nextInt();
    }
 
    if(h < 1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
 
  }
}