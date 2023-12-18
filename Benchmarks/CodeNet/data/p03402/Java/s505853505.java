import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(100 + " " + 100);
    for(int i = 0; i < 100; i++) {
      String s = "";
      if(i < 50) {
        if((i % 2) == 0) {
          for(int j = 0; j < 100; j++) {
            s += ".";
          }
        } else {
          for(int j = 0; j < 100; j++) {
            if((b > 1) && ((j % 2) == 0)) {
              s += "#";
              b--;
            } else {
              s += ".";
            }
          }          
        }
      } else {
        if((i % 2) == 0) {
          for(int j = 0; j < 100; j++) {
            s += "#";
          }
        } else {
          for(int j = 0; j < 100; j++) {
            if((a > 1) && ((j % 2) == 0)) {
              s += ".";
              a--;
            } else {
              s += "#";
            }
          }           
        }
      }
      System.out.println(s);
    }
  }
}