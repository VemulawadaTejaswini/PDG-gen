import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String h = scan.nextLine();
    boolean f = true;

    for(int i = 0; i < h.length(); i++){
      char s = h.charAt(i);
      if(i % 2 == 0){
        if(s == 'R' || s == 'U' || s == 'D'){
        }else{
          f = false;
        }

      } else {
        if(s == 'L' || s == 'U' || s == 'D'){
        }else{
          f = false;
        }
      }

      if(!f){
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");
  }
}
